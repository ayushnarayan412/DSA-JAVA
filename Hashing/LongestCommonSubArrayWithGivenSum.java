package Hashing;

public class LongestCommonSubArrayWithGivenSum {

  static int max(int arr1[],int arr2[]) {
    int n=arr1.length;
    int temp[]=new int[n];
    for(int i=0;i<n;i++)
    temp[i]=arr1[i]-arr2[i];
    int res=subarraywithmaxLength.maxlength(temp, 0);
    return res;
  }
  public static void main(String[] args) {
    int arr1[]={0,1,0,0,0,0};
    int arr2[]={1,0,1,0,0,1};
    System.out.println(max(arr1,arr2));
  }
  
}
