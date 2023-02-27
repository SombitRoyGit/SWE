package SWECode;

public class priorityqwithLink {
    
Node head;
NodeString headstring;

    class Node{
int data;
Node prev;
Node next;
int priority;
Node(int d,int p){
data=d;
priority=p;
prev=null;
next=null;

}

    }



    class NodeString{
        String data;
        NodeString prev;
        NodeString next;
        int priority;
        NodeString(String d,int p){
        data=d;
        priority=p;
        prev=null;
        next=null;
        
        }
        
            }


void pushstring(String d,int p){
                NodeString n=new NodeString(d,p);
                
                if (headstring==null){
                    headstring=n;
                }
                else{
                
                    NodeString n1=headstring;
                
                while(n1!=null){
                    
                    if(p<n1.priority){
                        n.next=n1;
                        if(n1.prev==null){
                            n1.prev=n;
                            headstring=n;
                        }
                        else{
                n.prev=n1.prev;
                n1.prev.next=n;
                n1.prev=n;
                
                        } 
                    break;
                    }
                    else if(n1.next==null) {
                n1.next=n;
                n.prev=n1;
                
                break;
                    }
                
                n1=n1.next;
                
                }
                
                }
                
                }










void push(int d,int p){
Node n=new Node(d,p);

if (head==null){
    head=n;
}
else{

Node n1=head;

while(n1!=null){
    
    if(p<n1.priority){
        n.next=n1;
        if(n1.prev==null){
            n1.prev=n;
            head=n;
        }
        else{
n.prev=n1.prev;
n1.prev.next=n;
n1.prev=n;

        } 
    break;
    }
    else if(n1.next==null) {
n1.next=n;
n.prev=n1;

break;
    }

n1=n1.next;

}

}

}

void print(){
Node g=head;
while(g!=null){
    System.out.println(g.data+" <== priority ==> "+g.priority);
    g=g.next;
}


}



void printstring(){
    NodeString g=headstring;
    while(g!=null){
        System.out.println(g.data+" <== priority ==> "+g.priority);
        g=g.next;
    }
    
    
    }
public static void main(String args[]){

    priorityqwithLink p=new priorityqwithLink();
    p.push(3,4);
    p.push(10,2);
    p.push(13,0);
    p.push(10,0);
    p.push(11,1);
    p.push(14,3);
    p.push(15,3);
    p.push(17,5);

p.print();

}


    
}
