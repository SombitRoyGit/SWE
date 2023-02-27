package SWECode;

public class intersectionlist {

Node head;
Node headintersec;

    class Node{
int data;
Node next;
Node(int d){
data=d;
next=null;

}
    }

void pushafter(int data)   {

Node n=new Node(data);
if (head==null){
    head=n;
}
else{
    Node n1=head;
    while(n1.next!=null)
{
n1=n1.next;

}

n1.next=n;

}

} 

void makesecondlist(int data){
Node intersec=new Node(data);

if(headintersec==null)
headintersec=intersec;
else{
Node n2=headintersec;
while(n2.next!=null){
n2=n2.next;
}
n2.next=intersec;

}
}

void makeintersec(){


    Node n1=head;
    Node n2=headintersec;

    while(n1!=null){
    if(n1.data==4)
    {
        while(n2.next!=null){
n2=n2.next;
        }
        n2.next=n1; 
    }
    n1=n1.next;
    }
    
    
}

void print(){
Node n=head;
while(n!=null){
System.out.println(n.data);
n=n.next;

}
System.out.println("................");
Node n1=headintersec;
while(n1!=null){
System.out.println(n1.data);
n1=n1.next;

}
}
    

public static void main(String args[]){
    intersectionlist i=new intersectionlist();
    i.pushafter(1);
    i.pushafter(3);
    i.pushafter(2);
    i.pushafter(4);
    i.pushafter(5);


i.print();

//intersectionlist j=new intersectionlist();
i.makesecondlist(10);
i.makesecondlist(11);

i.print();


System.out.println("make intersec");
i.makeintersec();
i.print();
}


}
