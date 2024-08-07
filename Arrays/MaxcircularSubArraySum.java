package Arrays;

public class MaxcircularSubArraySum {

  public static int maxCircularsum(int arr[]){
    int n=arr.length;
    int res=arr[0];
    for(int i=0;i<n;i++){
      int currMax=arr[i];
      int currSum=arr[i];
      for(int j=1;j<n;j++){
        int index=(i+j)%n;
        currSum+=arr[index];
        currMax=Math.max(currMax, currSum);
      }
      res=Math.max(res,currMax);
    }
    return res;
  }

  public static int normalMaxsum(int arr[],int n){
    int res=arr[0];
    int maxEnding=arr[0];
    for(int i=1;i<n;i++){
      maxEnding=Math.max(maxEnding+arr[i], arr[i]);
      res=Math.max(maxEnding, res);
    }
    return res;
  }

  public static int overallMaxsum(int arr[],int n){
    int max_normal=normalMaxsum(arr, n);
    if(max_normal<0){return max_normal;}
    int arr_sum=0;
    for(int i=0;i<n;i++){
      arr_sum+=arr[i];
      arr[i]=-arr[i];
    }
    int maxCircular=arr_sum+normalMaxsum(arr, n);
    return Math.max(max_normal, maxCircular);
  }

  public static void main(String[] args) {
    int arr[]={8,-8,9,-9,10,-11,12};
    int a=overallMaxsum(arr, arr.length);
    System.out.println(a);

  }
  
}
