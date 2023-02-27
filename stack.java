package SWECode;
import java.util.*;

public class stack {

    void Sortstack (Stack s1){

        Stack<Integer> temp=new Stack<Integer>();
        Stack<Integer> s=new Stack<Integer>();
        s=s1;

        while(!s.isEmpty()){

            temp.push(s.peek());
            s.pop();
        }

        //System.out.println(temp);

        while(!temp.isEmpty()){

if(s.isEmpty()){
    s.push(temp.peek());
    temp.pop();
}
else{

    int temppeek=temp.peek();
    temp.pop();
    while(!s.isEmpty() && s.peek()<temppeek ){
        temp.push(s.peek());
        s.pop();
    }
    s.push(temppeek);
}

//System.out.println(s);
System.out.println(temp);
        
        }
       
     
        System.out.println(s);
    }



public static void main(String args[]){
    Stack<Integer> s=new Stack<Integer>();
    s.push(12);
    s.push(11);
    s.push(20);
    s.push(15);
stack h=new stack();
System.out.println(s);

System.out.println();
h.Sortstack(s);


Queue<Integer> q=new ArrayDeque<Integer>();

}
    
}
