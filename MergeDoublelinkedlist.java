package SWECode;

import SWECode.doublylinkedlist.*;

public class MergeDoublelinkedlist {


int length(doublylinkedlist n){
    doublylinkedlist.Node n1=n.head;
    int count=0;
    while(n1!=null){
count++;
n1=n1.next;

    }

    return count;
}
    

    void sort(doublylinkedlist n){
        MergeDoublelinkedlist m=new MergeDoublelinkedlist(); 
        doublylinkedlist dleft=new doublylinkedlist();
        doublylinkedlist dright=new doublylinkedlist();
        int l=m.length(n);
        int mid=l/2;
        doublylinkedlist.Node node=n.head;
        doublylinkedlist.Node leftlist ;
        doublylinkedlist.Node rightlist ;
      
        
        int pL=0;
        int pR=0;
        while(node!=null && pL<mid){
            dleft.addbefore(node.data);
            node=node.next;
            pL++;
        }

        dleft.reverse();
        leftlist=dleft.head;

        while(node!=null && pR<mid){
            dright.addbefore(node.data);
            node=node.next;
            pR++;
        }

        dright.reverse();
       rightlist=dright.head;
        
        if(m.length(dleft)>1)
        sort(dleft);
        
        if(m.length(dright)>1)
        sort(dright);
        
        int i=0,j=0,k=0;
        doublylinkedlist.Node node2=n.head;
        
        while(leftlist!=null && rightlist!=null){
            
        if(leftlist.data<=rightlist.data)
        {
        
        node2.data=leftlist.data;
        leftlist=leftlist.next;
        
        }
        else if(rightlist.data<=leftlist.data){
        
            node2.data=rightlist.data;
            rightlist=rightlist.next;
            
        }
        
        node2=node2.next;
        }
        
        while(leftlist!=null){
            node2.data=leftlist.data;
        leftlist=leftlist.next;
        node2=node2.next;
        }
        
        while(rightlist!=null){
            node2.data=rightlist.data;
            rightlist=rightlist.next;
            node2=node2.next;
        }
        
        
        }



        public static void main(String args[]){
            doublylinkedlist d=new doublylinkedlist();
            d.addbefore(1);
            d.addbefore(1);
            d.addbefore(3);
            d.addbefore(2);

d.print();
MergeDoublelinkedlist m=new MergeDoublelinkedlist();
m.sort(d);
d.print();

        }
    
}
