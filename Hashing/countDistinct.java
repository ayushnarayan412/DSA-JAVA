package Hashing;

import java.util.*;

public class countDistinct {

  static int countDist(int arr[]){
    int n=arr.length;
    HashSet<Integer> s=new HashSet<>();
    for(int i=0;i<n;i++){
      s.add(arr[i]);
    }
    return s.size();
  }

  static int count(Integer arr[]){
    HashSet<Integer> s=new HashSet<>(Arrays.asList(arr));
    return s.size();
  }

  public static void main(String[] args) {
    int arr[]={10,12,12,13,13,14,14,15};
    System.out.println(countDist(arr));
  }
  
}
