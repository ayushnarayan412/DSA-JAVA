package Hashing;

import java.util.*;

public class LongestConsecutiveSequence {

  static int longestSub(int arr[]){
    int res=1;
    Set<Integer> h=new HashSet<>();
    for (int x : arr) {
      h.add(x);
    }
    for (Integer x : h) {
      if(h.contains(x-1)==false){
        int curr=1;
        while(h.contains(x+curr))
        curr++;
        res=Math.max(res, curr);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[]={1,3,9,2,8,2};
    System.out.println(longestSub(arr));
  }
  
}
