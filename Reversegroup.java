package SWECode;
import SWECode.doublylinkedlist.*;
public class Reversegroup {

void reverse(doublylinkedlist d){
    doublylinkedlist.Node n1=d.head;
    doublylinkedlist.Node pr=null;
    doublylinkedlist.Node cr=n1;
    doublylinkedlist.Node nr=n1.next;

    while(n1!=null){
cr.next=pr;
pr=cr;
cr=nr;
if(nr!=null)
nr=nr.next;

pr.prev=cr;
if(cr==null)
d.head=pr;

n1=cr;

    }

}

void delete(doublylinkedlist d){

    doublylinkedlist.Node n1=d.head;
    doublylinkedlist.Node next;
    while(n1!=null){
next=n1.next;
n1.next=null;
d.head=next;
n1=next;
    }

}

void reversegroup(doublylinkedlist d,int group){

    doublylinkedlist.Node n1=d.head;
    doublylinkedlist.Node n2;
    doublylinkedlist dsmall=new doublylinkedlist();   
    
    
while(n1!=null){
    int k=0;
    int k2=0;
    n2=n1;
    while(k<group && n1!=null){
        dsmall.addbefore(n1.data);
        n1=n1.next;
k++;

    }
    dsmall.reverse();
    Reversegroup r1=new Reversegroup();
r1.reverse(dsmall);
doublylinkedlist.Node smallernode=dsmall.head;

while(smallernode!=null){
    n2.data=smallernode.data;
    smallernode=smallernode.next;
    n2=n2.next;
    k2++;
}

r1.delete(dsmall);

}

}


    public static void main (String args[]){
        doublylinkedlist d=new doublylinkedlist();
        d.addbefore(1);
        d.addbefore(2);
        d.addbefore(3);
        d.addbefore(8);
        d.print();

        System.out.println("reverse");
        Reversegroup r=new Reversegroup();
        //r.reverse(d);
        r.reversegroup(d, 2);
        d.print();
    }
    
}
