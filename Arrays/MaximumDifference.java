package Arrays;

public class MaximumDifference {

  public static int maxDiff(int arr[]){
    int n=arr.length;
    int res=arr[1]-arr[0];
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        res=Math.max(res, arr[j]-arr[i]);
      }
    }
    return res;
  }

  public static int maxdiff(int arr[]){
    int n=arr.length;
    int res=arr[1]-arr[0];
    int minval=arr[0];
    for(int j=1;j<n;j++){
      res=Math.max(res, arr[j]-minval);
      minval=Math.min(minval, arr[j]);
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[]={2,3,10,6,4,8,1};
    int res=maxDiff(arr);
    System.out.println(res);
    System.out.println(maxdiff(arr));
  }
  
}
