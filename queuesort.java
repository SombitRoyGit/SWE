package SWECode;
import java.util.*;
//using a stack
public class queuesort {

void sortusingstack(Queue q){

Stack<Integer> s=new Stack<Integer>();
Queue<Integer> q1=new LinkedList<Integer>();
q1=q;




while(!q1.isEmpty()){

if(s.isEmpty()){
    s.push(q1.poll());
}
else{
    int item=q1.poll();
while(!s.isEmpty() && item>s.peek()){
q1.add(s.pop());
}

    s.push(item); 
}

}

while(!s.isEmpty())
q1.add(s.pop());


System.err.println(q1);
}


    public static void main (String args[]){

Queue<Integer> q=new LinkedList<Integer>();

q.add(4);
q.add(1);
q.add(1);
q.add(5);
q.add(2);
q.add(3);
System.err.println(q);

queuesort q1=new queuesort();
q1.sortusingstack(q);

    }
}
