package SWECode;

public class Merge {
   
    
void sort(int arr[]){
int l=arr.length;
int mid=l/2;
int Leftarr[]=new int[mid];
int rightarr[]=new int[l-mid];
int p=0;

for(int i=0;i<Leftarr.length;i++){
    Leftarr[i]=arr[p];
    p++;
}

for(int j=0;j<rightarr.length;j++){
    rightarr[j]=arr[p];
    p++;
}

if(Leftarr.length>1)
sort(Leftarr);

if(rightarr.length>1)
sort(rightarr);

int i=0,j=0,k=0;

while(i<Leftarr.length && j<rightarr.length){
if(Leftarr[i]<=rightarr[j])
{
arr[k]=Leftarr[i];

i++;

}
else if(rightarr[j]<=Leftarr[i]){


    arr[k]=rightarr[j];
    
    j++;
    
}

k=k+1;
}

while(i<Leftarr.length){
    arr[k]=Leftarr[i];
    i++;
    k++;
}

while(j<rightarr.length){
    arr[k]=rightarr[j];
    j++;
    k++;
}



}




    public static void main(String args[]){

        Merge m=new Merge();
        int arr[]={1,3,2,1};
        m.sort(arr);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);


    }
}
