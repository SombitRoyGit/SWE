package SWECode;
import java.util.*;

//https://www.geeksforgeeks.org/largest-rectangular-area-in-a-histogram-using-stack/

public class histrogram {





int maxhistogram(int arr[]){
int max=0;
int leftarr[]=new int[arr.length];
int rightarr[]=new int[arr.length];
Stack<Integer> stack=new Stack<Integer>();

stack.push(0);

///making right array
for(int i=1;i<arr.length;i++){
while(!stack.isEmpty() && arr[i]<arr[stack.peek()])
{
rightarr[stack.peek()]=i;
stack.pop();
}

stack.push(i);
}

while(!stack.isEmpty()){
    rightarr[stack.peek()]=rightarr.length-1;
stack.pop();
}

//making left array
stack.push(leftarr.length-1);
for(int i=arr.length-2;i>=0;i--){
    while(!stack.isEmpty() && arr[i]<arr[stack.peek()])
    {
        leftarr[stack.peek()]=i;
    stack.pop();
    }
    
    stack.push(i);
    }

    while(!stack.isEmpty()){
        leftarr[stack.peek()]=0;
    stack.pop();
    }


for(int i=0;i<arr.length;i++){

    if(Math.abs(leftarr[i]-rightarr[i])!=1 || Math.abs(leftarr[i]-rightarr[i])!=2){

if(leftarr[i]==0 || rightarr[i]==arr.length-1){

    int maxtemp=arr[i]*(rightarr[i]-leftarr[i]);
    if (maxtemp>max)
    max=maxtemp;
}
else{

    int maxtemp=arr[i]*Math.abs(rightarr[i]-leftarr[i]-1);
    if (maxtemp>max)
    max=maxtemp;
}

    }
}

for(int i=0;i<leftarr.length;i++){

    System.out.println(leftarr[i]);
}

return max;
}



    public static void main(String args[]){



    int arr[]={6, 2, 5, 4, 5, 1, 6};
    histrogram h=new histrogram();
    System.out.println( h.maxhistogram(arr));

}
    
}
