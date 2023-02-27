package SWECode;
import java.util.*;

//Delete consecutive same words in a sequence Input : ab aa aa bcd ab
//Output : 3
public class deletesamestring {
    
    int output(String s2){
        String s=s2+" ";
Stack<String> s1=new Stack<String>();
String st="";
for(int i=0;i<s.length();i++){
    if(s.charAt(i)!=' '){
        st=st+s.charAt(i);
        st.split("");
        
    }  
    
else 
{

    if(s1.isEmpty()){
        s1.push(st);
        st="";
    } 
    else{
if(s1.peek().equals(st)){
    s1.pop();
    st="";
}
else{
    s1.push(st);
    st="";
}

//for last string

System.out.println(s1);

    }

    
   
}

}

System.out.println(s1.peek());

 
return s1.size();
    }



    public static void main(String args[]){

        deletesamestring d=new deletesamestring();
       System.out.println(d.output("tom jerry jerry tom")); 



    }
}
