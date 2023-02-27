package SWECode;

public class doublylinkedlist {
public Node head;

public class Node{
    public int data;
    public Node next;
    public Node prev;

    Node(int d){

data=d;
next=null;
prev=null;
    }

}

void addbefore(int data){

    Node n=new Node(data);
    if(head==null){
        head=n;
    }
    else{
n.next=head;
head.prev=n;
head=n;


    }
}

void print(){
Node n=head;

while(n!=null){
    System.out.println(n.data);
    n=n.next;
}


}

void printwithprev(){
    Node n=head;
    
    while(n.next!=null){
        n=n.next;
    }
    
    while(n!=null){
        System.out.println(n.data);
        n=n.prev;
    }
    }

public void delete(int d){

    Node n=head;
    Node prev;
    Node nextelement;
    while(n!=null){
if(n.data==d){
prev=n.prev;
prev.next=n.next;
nextelement=n.next;
nextelement.prev=prev;
n.next=null;
n.prev=null;
break;
}
n=n.next;

    }
}
    
int length(){
    Node n=head;
     int count=0;
     while(n!=null){
 count++;
 n=n.next;
 
     }
 
     return count;
 }

void reverse(){
Node current=head;
Node nextel=head.next;

while(current!=null){
  if(current==head){
    current.next=null;
  }
current.prev=nextel;
if(current.prev==null)
 break;
current=nextel;
nextel=nextel.next;
current.next=current.prev;
}

head=current;
}



public static void main (String args[]){

doublylinkedlist d=new doublylinkedlist();
d.addbefore(10);
d.addbefore(11);
d.addbefore(13);
d.addbefore(1);
//d.print();
//d.printwithprev();
d.delete(11);
d.print();
System.out.println("reverse");
d.reverse();
d.print();
}
    
}
