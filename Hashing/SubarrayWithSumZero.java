package Hashing;

import java.util.*;

public class SubarrayWithSumZero{

  static boolean isWithSumZero(int arr[]){
    HashSet<Integer> h = new HashSet<>();
    int preSum=0;
    for(int i=0;i<arr.length;i++) {
      preSum+=arr[i];
      if(h.contains(preSum))
        return true;
      if(preSum==0)
        return true;
      h.add(preSum);    
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[]={-3,1,-1,3};
    System.out.println(isWithSumZero(arr));
  }
}