package Searching;

public class Count1inaBinaryArray {

  public static int countOne(int arr[]){
    int low=0,high=arr.length-1;
    int n=arr.length;
    while(low<=high){
      int mid=(low+high)/2;
      if(arr[mid]==0){
        low=mid+1;
      } else{
        if(mid==0 || arr[mid-1]!=arr[mid]){
          return (n-mid);
        } else{
          high=mid-1;
        }
      }
    }
    return 0;
  }
  public static void main(String[] args) {
    int arr[]={0,0,0,1,1,1,1};
    System.out.println(countOne(arr));
  }
  
}
