package SWECode;
import java.util.*;
import SWECode.priorityqwithLink.*;

public class infixtopostfix {

int priority(char c,priorityqwithLink p1){

    priorityqwithLink.NodeString n=p1.headstring;
    int p=0;
String s=Character.toString(c);
while(n!=null){

    if(n.data.equals(s)){
p=n.priority;
    }

    n=n.next;
}

   
    return p;

}

    void prefix(String s, priorityqwithLink p1){
        Stack<Character> stack=new Stack<Character>();
        infixtopostfix f=new infixtopostfix();

String output="";

for(int i=0;i<s.length();i++){

    if(s.charAt(i)=='(' || s.charAt(i)==')' || s.charAt(i)=='^' || s.charAt(i)=='*' || s.charAt(i)=='/' || s.charAt(i)=='+' || s.charAt(i)=='-'){

        if(s.charAt(i)==')'){

while(!stack.isEmpty()){
if(stack.peek()!='('){
    output=output+stack.peek();
    stack.pop();
}
else{
    stack.pop();
break;
}
    
}
        }
        else if (s.charAt(i)=='('){
            stack.push(s.charAt(i));
        }

        else{
            if(stack.isEmpty()){
                stack.push(s.charAt(i));   
            }
/*else if(f.priority(stack.peek(), p1)<=f.priority(s.charAt(i), p1) && stack.peek()!='('){
    while(!stack.isEmpty()){
        output=output+stack.peek();
        stack.pop();
    }

    stack.push(s.charAt(i));
}*/
else{
    while(!stack.isEmpty()){
        if(f.priority(stack.peek(), p1)<=f.priority(s.charAt(i), p1) && stack.peek()!='('){
        output=output+stack.peek();
        stack.pop();
    }
    else{
        break; 
    }
    }

    stack.push(s.charAt(i));
}


            
        }


    }
else{


    output=output+s.charAt(i);
}
}

while(!stack.isEmpty()){
    output=output+stack.peek() ;
    stack.pop();
}
System.out.println(output);

    }

    public static void main(String args[]){

        priorityqwithLink p=new priorityqwithLink();

        p.pushstring("(", 0);
        p.pushstring("^", 1);
        p.pushstring("*", 2);
        p.pushstring("/", 2);
      p.pushstring("+", 3);
      p.pushstring("-", 3);

   // p.printstring();
    infixtopostfix f=new infixtopostfix();
  f.prefix("((A+B)-C*(D/E))+F ", p);
 
    }

    
}
