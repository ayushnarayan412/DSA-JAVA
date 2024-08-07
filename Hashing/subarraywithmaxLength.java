package Hashing;

import java.util.*;

public class subarraywithmaxLength {

  static int maxlength(int arr[],int sum){
    Map<Integer,Integer> m= new HashMap<>();
    int preSum=0,res=0;
    for(int i=0;i<arr.length;i++){
      preSum+=arr[i];
      if(preSum==sum)
      res=i+1;
      if(m.containsKey(preSum)==false)
      m.put(preSum,i);
      if(m.containsKey(preSum-sum))
      res=Math.max(res,i-m.get(preSum-sum));
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[]={5,2,3};
    System.out.println(maxlength(arr, 5));
  }
  
}
