package Arrays;

public class MaxsubArray {

  public static int maxSum(int arr[],int n){
    int res=arr[0];
    for(int i=0;i<n;i++){
      int curr=0;
      for(int j=i;j<n;j++){
        curr=curr+arr[j];
        res=Math.max(res,curr);
      }
    }
    return res;
  }
  //Kadane algorithm
  public static int Maxsum(int arr[],int n){
    int res=arr[0];
    int maxEnding=arr[0];
    for(int i=1;i<n;i++){
      maxEnding=Math.max(maxEnding+arr[i], arr[i]);
      res=Math.max(maxEnding, res);
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[]={-3,8,-2,4,-5,6};
    System.out.println(maxSum(arr, arr.length));
    System.out.println(Maxsum(arr, arr.length));
  }
  
}
