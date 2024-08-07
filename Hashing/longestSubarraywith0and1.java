package Hashing;

public class longestSubarraywith0and1 {
  static int longestSub(int arr[],int n){
    int res=0;
    for(int i=0;i<n;i++){
      int c0=0,c1=0;
      for(int j=i;j<n;j++){
        if(arr[j]==0)
        c0++;
        else c1++;
        if(c0==c1)
        res=Math.max(res,c0+c1);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    
  }
  
}
