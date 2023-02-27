package SWECode;
import java.util.*;
//https://www.geeksforgeeks.org/find-the-maximum-of-minimums-for-every-window-size-in-a-given-array/#discuss
//very important
public class window {

    void windowfunc(int arr[]){
Stack<Integer> stack=new Stack<Integer>();
        //create left array where left elements are smaller
int leftarr[]=new int[arr.length];

stack.push(arr.length-1);

for(int i=arr.length-2;i>=0;i--){
while(!stack.isEmpty() && arr[i]<arr[stack.peek()]){
leftarr[stack.peek()]=i;
    stack.pop();
}
stack.push(i);
}

while(!stack.isEmpty()){
leftarr[stack.peek()]=-1;
stack.pop();
}

        //create right array where right elements are smaller
        int rightarr[]=new int[arr.length];
        stack.push(0);
        for(int i=1;i<arr.length;i++){
            while(!stack.isEmpty() && arr[i]<arr[stack.peek()]){
                rightarr[stack.peek()]=i;
                stack.pop();
            }
            stack.push(i);
            }
            while(!stack.isEmpty()){
                rightarr[stack.peek()]=-1;
                stack.pop();
                }
 
                
int newarr[]=new int[arr.length];
for(int i=0;i<newarr.length;i++)  {
    newarr[i]=-1;
}  

int min=0;
for(int i=0;i<arr.length;i++){

if(leftarr[i]==-1 && rightarr[i]==-1){
    newarr[newarr.length-1]=arr[i];
    min=arr[i];
}
else if (leftarr[i]==-1){
    newarr[Math.abs(rightarr[i]-1-0)]=Math.max(arr[i],newarr[Math.abs(rightarr[i]-1-0)]);
}
else if (rightarr[i]==-1){
    newarr[Math.abs(6-(leftarr[i]+1))]=Math.max(arr[i],newarr[Math.abs(6-(leftarr[i]+1))]);
}
else{
    newarr[Math.abs(rightarr[i]-1-(leftarr[i]+1))]=Math.max(arr[i],newarr[Math.abs(rightarr[i]-1-(leftarr[i]+1))]);

}

}

for(int i=newarr.length-1;i>=0;i--){
    if(newarr[i]==-1)
    newarr[i]=Math.max(newarr[i],newarr[i+1]);
}

for(int j=0;j<newarr.length;j++){


    System.out.println(newarr[j]);
}

    }


    public static void main(String args[]){

        int arr[] = {10,20,30,50,10,70,30} ;

        window w=new window();
        w.windowfunc(arr);


    }
    
}
