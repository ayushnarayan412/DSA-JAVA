package Hashing;

import java.util.*;

public class subarraywithgivensum {

  static boolean iswithsum(int arr[],int sum){
    Set<Integer> h= new LinkedHashSet<>();
    int preSum=0;
    for(int i=0;i<arr.length;i++){
      preSum+=arr[i];
      if(preSum==sum) return true;
      if(h.contains(preSum-sum)) return true;
      h.add(preSum);
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[]={5,3,2,-1};
    System.out.println(iswithsum(arr, 4));
  }
  
}
