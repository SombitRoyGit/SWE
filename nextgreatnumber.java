package SWECode;
import java.util.*;

//https://www.geeksforgeeks.org/next-greater-element/

class nextgreatnumber {


void nextgreat(int arr[]){
Stack<Integer> stack=new Stack<Integer>();
stack.add(arr[0]);

for(int i=1;i<arr.length;i++){
while(!stack.isEmpty() && stack.peek()<arr[i]){
System.out.println(stack.peek()+" next great element "+arr[i]);
stack.pop();
}

stack.add(arr[i]);

}

System.out.println(stack.peek()+" next great element "+"-1");
int element=stack.pop();
if(!stack.isEmpty()){
  if(element>stack.peek())
  System.out.println(stack.peek()+" next great element "+element);
else
System.out.println(stack.peek()+" next great element "+"-1");
  element=stack.pop();
}


}



public static void main(String args[]){
nextgreatnumber n=new nextgreatnumber();
int arr[]= {13,2,14,5,8,17};
n.nextgreat(arr);

}


}