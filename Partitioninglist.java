package SWECode;

public class Partitioninglist {

void partition(LinkedlistJava l1,int number){

    LinkedlistJava lsmall =new LinkedlistJava();
    LinkedlistJava lmid =new LinkedlistJava();
    LinkedlistJava lbig =new LinkedlistJava();


    LinkedlistJava.Node node=l1.head;
    LinkedlistJava.Node node2=l1.head;
    while(node!=null){

if(node.data<number){
    lsmall.pushbefore(node.data);
    node=node.next;

}
else if(node.data==number)
{
    lmid.pushbefore(node.data);
    node=node.next;
}
else if(node.data>number)
{
    lbig.pushbefore(node.data);
    node=node.next;
}

    }
lsmall.reverse();
lmid.reverse();
lbig.reverse();

     while(node2!=null){
      LinkedlistJava.Node nsmall=lsmall.head;
      LinkedlistJava.Node nmid=lmid.head;
      LinkedlistJava.Node nlarge=lbig.head;

while(nsmall!=null){
    node2.data=nsmall.data;
    nsmall=nsmall.next;
    node2=node2.next;
}
while(nmid!=null){
    node2.data=nmid.data;
    nmid=nmid.next;
    node2=node2.next;
}

while(nlarge!=null){
    node2.data=nlarge.data;
    nlarge=nlarge.next;
    node2=node2.next;
}


    }


}


    public static void main (String args[]){



        LinkedlistJava l =new LinkedlistJava();
        l.pushbefore(1);
        l.pushbefore(1);
        l.pushbefore(2);
        l.pushbefore(3);
        l.pushbefore(10);
        l.print();


        Partitioninglist p=new Partitioninglist();
        p.partition(l, 3);
        System.out.println("-<<<<<<<<>>>>>>-");
        l.print();
    }
    
}
