package Hashing;

import java.util.*;

public class FrequencyOfelement {

  static void freq(int arr[],int n){
    for(int i=0;i<n;i++){
      //check if seen before
      boolean flag=false;
      for(int j=0;j<i;j++){
        if(arr[i]==arr[j]){
          flag=true;
          break;
        }
      }
      //if seen ignore 
        if(flag==true){ continue;}
        int freq=1;
        //if not seen before count freq
        for(int k=i+1;k<n;k++){
          if(arr[i]==arr[k]){
            freq++;
          }
        }
        System.out.println(arr[i]+" "+freq);
    }
  }

  static void count(int arr[]){
    //LinkedHashMap can be used to print element in order as they appear in array
    HashMap<Integer,Integer> h = new HashMap<>();
    for(int x:arr){
      h.put(x,h.getOrDefault(x ,0)+1);
    }
    for(Map.Entry<Integer,Integer> e : h.entrySet()/*can get key pair using entrySet() **/ ){
      System.out.println(e.getKey()+" "+e.getValue());
    }
  }

  public static void main(String[] args) {
    int arr[]={10,20,20,30,30,10};
    count(arr);
  }
  
}
