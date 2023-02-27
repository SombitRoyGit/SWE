package SWECode;
import java.util.*;
// very important using stack--> https://www.geeksforgeeks.org/the-stock-span-problem/
public class stockplan {
    

    void plan(int arr[]){
int printarray[]=new int[arr.length];
printarray[0]=1;
Stack<Integer> stack=new Stack<Integer>();
stack.push(0);

for(int i=1;i<arr.length;i++){
while(!stack.empty() && arr[stack.peek()]<=arr[i]){
    stack.pop();
}

    


printarray[i]=(stack.empty() ? i+1 : i-stack.peek());

stack.push(i);

}



for (int i : printarray) {
    System.out.println(i);
}
    }

    public static void main(String args[]){

int price[] = {100 ,80 ,60, 70 ,60 ,75 ,85};

stockplan s=new stockplan();
s.plan(price);



    }
}
