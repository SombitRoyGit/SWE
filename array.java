package SWECode;

import java.util.ArrayList;
import java.util.Hashtable;

import java.io.*;
import java.util.*;

public class array {


public void sort(int arr[],int x){
  HashMap <Integer, Integer> h=new HashMap<>(); 
  for(int i=0;i<arr.length;i++){
if(x>arr[i]){
    h.put(x-arr[i],arr[i]);
}
else{

    h.put(arr[i]-x,arr[i]);  
}
   
  }
  
  System.out.println(h);



}

    public void rotate(int arr[],int d){
int temp=0;
for(int i=0;i<arr.length;i++){
    if(d<arr.length){
temp=arr[i];
arr[i]=arr[d];
arr[d]=arr[i+1];
arr[i+1]=temp;

    d++;
}

}
for (int j : arr) {
    System.out.println(j);
}

    }
    public static void main(String args[]){


        int a[] = {10, 5, 3, 9, 2};
        array ar=new array();
        ar.sort(a,7);

    }
 


}
