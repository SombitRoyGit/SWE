package SWECode;
import SWECode.LinkedlistJava.*;
import SWECode.MergeDoublelinkedlist.*;

public class SublistSearch {
    boolean result=false;

   static int length(LinkedlistJava n){
        LinkedlistJava.Node n1=n.head;
        int count=0;
        while(n1!=null){
    count++;
    n1=n1.next;
    
        }
    
        return count;
    }

    boolean search(LinkedlistJava n1, LinkedlistJava n2){
       

int node1length=SublistSearch.length(n1);
int node2length=SublistSearch.length(n2);
int lencount=0;

if (node2length<=node1length){

    LinkedlistJava.Node node1=n1.head;
    LinkedlistJava.Node node2=n2.head;
while(node1!=null){

if(node1.data==node2.data){
    node1=node1.next;
    node2=node2.next;
    lencount++;
while(node2!=null){
    if(node1.data==node2.data){
        node2=node2.next;
        node1=node1.next;
        lencount++;
    }
    else{
       
        break;
    }
}
}
node1=node1.next;

}
if (lencount==node2length)
result=true;
else
result=false;

}

 return result;
    }




public static void main(String args[]){
    LinkedlistJava l1=new LinkedlistJava();
l1.pushbefore(1);
l1.pushbefore(10);
l1.pushbefore(11);
l1.print();

System.out.println("");
    LinkedlistJava l2=new LinkedlistJava();
   
    l2.pushbefore(10);
 
    l2.print();

    SublistSearch l3=new SublistSearch();

    System.out.println(l3.search(l1,l2));
}

}
