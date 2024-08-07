package Hashing;

import java.util.*;

public class intersectionOftwoUnsortedArray {

  static void intersection(int a[],int b[]){
    int m=a.length;
    int n=b.length;
    HashSet<Integer> h = new HashSet<Integer>();
    for(int i=0;i<n;i++){
       h.add(b[i]);
    }
    for(int i=0;i<m;i++){
      if(h.contains(a[i]))
      System.out.print(a[i]+" ");
    }
  }

  public static void main(String[] args) {
    int a[]={10,15,20,25,30};
    int b[]={30,10,15,90};
    intersection(a, b);
  }
  
}
