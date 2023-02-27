package SWECode;


//iteration process logic -->https://www.geeksforgeeks.org/iterative-tower-of-hanoi/
public class TOH {


    void toh(int n,char A,char B,char C){

if(n==0){
    return;
}

else{
    toh(n-1,A,C,B);
    System.out.println("move "+(n)+" dice from "+A+" to "+B);
    toh(n-1,C,B,A);
    

    }
    
  
}
public static void main (String args[]){
    TOH h=new TOH();
    h.toh(4, 'A','B', 'C');



}

}
