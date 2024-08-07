package Arrays;

public class WindowSlidingTechnique {

  //returns the maximum sum of k consecutive element of array

  public static int maxsum(int arr[],int n,int k) {
    int res=Integer.MIN_VALUE;
    for(int i=0;i+k-1<n;i++){
      int curr=0;
      for(int j=0;j<k;j++){
        curr+=arr[i+j];
      }
        res=Math.max(curr, res);
    }
    return res;
  }

  public static int Maxsum(int arr[],int n,int k){
    int curr=0;
    for(int i=0;i<k;i++)
      curr+=arr[i];
    int res=curr;
    for(int i=k;i<n;i++){
      curr=curr+arr[i]-arr[i-k];
      res=Math.max(res,curr);
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[]={1,8,30,-5,20,7};
    System.out.println(maxsum(arr, arr.length, 4));
    System.out.println(Maxsum(arr, arr.length, 4));
  }
  
}
