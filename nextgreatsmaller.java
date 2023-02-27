package SWECode;
import java.util.*;

public class nextgreatsmaller {
    
    void find(int arr[]){


Stack<Integer> nextgreat= new Stack<Integer>();
int ans[]=new int[arr.length];
int nextgreatarr[]=new int[arr.length];
int nextgreatsmallarr[]=new int[arr.length];

//create nextgreatarr--->
nextgreat.push(0);
for(int i=1;i<arr.length;i++){

    while(!nextgreat.isEmpty() &&  arr[i]>arr[nextgreat.peek()]){
        nextgreatarr[nextgreat.peek()]=i;
        nextgreat.pop();
    }

    nextgreat.push(i);

}

while(!nextgreat.isEmpty()){
    nextgreatarr[nextgreat.peek()]=-1;
    nextgreat.pop();
}

//create nextgreatsmallarr--->
nextgreat.push(0);
for(int i=1;i<arr.length;i++){

    while(!nextgreat.isEmpty() &&  arr[i]<arr[nextgreat.peek()]){
        nextgreatsmallarr[nextgreat.peek()]=i;
        nextgreat.pop();
    }

    nextgreat.push(i);

}

while(!nextgreat.isEmpty()){
    nextgreatsmallarr[nextgreat.peek()]=-1;
    nextgreat.pop();
}


for(int i=0;i<ans.length;i++){
if(nextgreatarr[i]!=-1){
    if(nextgreatsmallarr[nextgreatarr[i]]!=-1)
    ans[i]=arr[nextgreatsmallarr[nextgreatarr[i]]];
    else
    ans[i]=-1;
}
else{
    ans[i]=-1;
}


}


for (int i:ans) {
    System.out.println(i);
    
}

    }


    


    public static void main(String args[]){

        nextgreatsmaller n=new nextgreatsmaller();
        int arr[] = {4, 8, 2, 1, 9, 5, 6, 3};
        n.find(arr);

    }

}
