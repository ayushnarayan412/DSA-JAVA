package Hashing;

import java.util.*;

public class unionOfTwoUnsortedArray {

  static int unioncount(int a[],int b[]){
    Set<Integer> h = new HashSet<>();
    for(int x : a)
    h.add(x);
    for(int x : b)
    h.add(x);
    System.out.println(h);
    return h.size();
  }

  public static void main(String[] args) {
    int a[]={10,30,10,40};
    int b[]={40,5,10,15};
    System.out.println(unioncount(a, b));
  }
  
}
