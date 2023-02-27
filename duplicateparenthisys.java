package SWECode;
//https://www.geeksforgeeks.org/find-expression-duplicate-parenthesis-not/


import java.util.*;

public class duplicateparenthisys {

Boolean operand(char C){
boolean flag=false;

for(char i='a';i<='z';i++){
if(C==i){
    flag=true;
    break;
}

}

return flag;
}

Boolean operator(char C){
    boolean flag=false;
    
    
    if(C=='+' || C=='-' || C=='*' || C=='/'){
        flag=true;
       
    }
    
    
    
    return flag;
    }


    boolean findduplicate(String s){
boolean flag=false;
Stack<Character> stack=new Stack<Character>();

for(int i=0;i<s.length();i++)
{

    if(s.charAt(i)==')' && (operand(stack.peek()) || operator(stack.peek())) && i!=s.length()-1){
while(!stack.isEmpty() && stack.peek()!='('){
    stack.pop();
}
stack.pop();
    }
    else{
stack.push(s.charAt(i));
    }
}
System.out.println(stack);

while(!stack.isEmpty()){
    char element=stack.peek();

    if(stack.peek()==')'){
stack.pop();
if(stack.peek()=='('){
    flag=true;
    break;
}


    }
    else{
stack.pop();
    }
    
    }

return flag;
    }

    public static void main (String args[]){
        duplicateparenthisys d=new duplicateparenthisys();
       
System.out.println(d.findduplicate("(a+b)+(c+d)")); 


    }
    
}
