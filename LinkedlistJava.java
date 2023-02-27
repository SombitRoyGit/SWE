package SWECode;



public class LinkedlistJava {
    Node head;

    class Node{
       
    int data;
    int level;
    Node next;
    boolean visit;
        
        Node(int d){
data=d;
next=null;
visit= false;
level=0;

        }

    }


 void pushbefore(int d){
    int data=d;
    Node newnode=new Node(data);

    if(head==null)
{
    
    head=newnode;
}

else{
    newnode.next=head;
    head=newnode;
}
 }       


 void pushafter(int d){

    Node newnode=new Node(d);
Node next=head;

while(next.next!=null){
next=next.next;
}
next.next=newnode;

 }


 void pushbetweenafter(int d,int pushvalue){

    Node newnode=new Node(d);
Node next=head;

while(next!=null){
    if(next.data==pushvalue){
        newnode.next= next.next;
        next.next=newnode;
        break;
    }
next=next.next;
}


 }


 void print(){
Node next=head;
while(next!=null){
    System.out.println(next.data);
    next=next.next;
}

 }

void reverse(){
Node prev=head;
Node current=null;

while(prev!=null){
Node n=prev;
prev=prev.next;
n.next=current;
current=n;

}

head=current;

}

void loopcreate(){
Node n=head;
Node n2=head;

while(n.next!=null){
    n=n.next;
}

   
while(n2!=null)
{
    if(n2.data==2){
        n.next=n2;
        break;
    }
    n2=n2.next;
}

}

 boolean checkloop(){
boolean loop=false;

Node n=head;

while(n!=null){
   if(n.visit!=true) 
{
    n.visit=true;
   
    n=n.next;
}
else{
    loop=true; 
    break;
}

}

return loop;
}


int checklooplength(){
    
    int maxlevel=0;
    int length=0;
    Node n=head;
    
    while(n!=null){
       if(n.visit!=true) 
    {
        n.visit=true;
        n.level=maxlevel;
        maxlevel++;
        n=n.next;
    }
    else{
        
          length=maxlevel-n.level;
        break;
    }
    
    }
    
    return length;
    }

void removeduplicate(){
Node n=head;

while(n!=null){
if(n==head && n.data==n.next.data)
{
head=n.next;
n=n.next;
}
else if (n!=head  && n.next!=null){
    if(n.data==n.next.data)
n.next=n.next.next;
else{
    n=n.next;
}

}
else{
    n=n.next;
}


}
}

 public static void main(String args[]){
LinkedlistJava l=new LinkedlistJava();
l.pushbefore(12);
l.pushbefore(12);
l.pushbefore(11);
l.pushbefore(10);
l.pushbefore(10);
l.pushbefore(10);
l.pushbefore(9);
l.pushbefore(9);
//l.pushafter(1);
//l.pushbetweenafter(2,11);
l.print();
//System.out.println(" reverse ");
//l.reverse();
//l.print();
//l.loopcreate();
//System.out.println(l.checkloop());
//l.print();
//System.out.println(l.checklooplength());

l.removeduplicate();
l.print();
 }

}
