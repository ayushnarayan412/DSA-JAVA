package Recursion;

public class SubsetSumProblem {
  public static int countSubsets(int arr[],int n,int sum){
    if(n==0){
      return (sum==0) ? 1:0;
    }
    return countSubsets(arr, n-1, sum)+countSubsets(arr, n-1, sum-arr[n-1]);
  }

  public static void main(String[] args) {
    int arr[]={10,20,15};
    int res=countSubsets(arr, arr.length, 25);
    System.out.println(res);

  }


}
