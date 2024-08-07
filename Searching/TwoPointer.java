package Searching;

public class TwoPointer {

  public static boolean isPair(int arr[],int sum){
    int i=0,j=arr.length-1;
    while(i<=j){
    if(arr[i]+arr[j]==sum){
      return true;
    }
    if(arr[i]+arr[j]>sum){
      j--;
    } else{
      i--;
    }
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[]={2,5,8,12,30};
    System.out.println(isPair(arr, 17));
  }
  
}
