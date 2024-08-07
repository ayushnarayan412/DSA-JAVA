package Searching;

public class TripletInAsortedArray {

  public static boolean isTriplet(int arr[],int x){
    for(int i=0;i<arr.length-2;i++){
      if(isPair(arr,x-arr[i],i+1))
        return true;
    }
    return false;
  }

  public static boolean isPair(int arr[],int sum,int start){
    int i=start,j=arr.length-1;
    while(i<j){
      if(arr[i]+arr[j]==sum) return true;
      if(arr[i]+arr[j]<sum){
        i++;
      } else {
        j--;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[]={1,2,3,4,6};
    System.out.println(isTriplet(arr, 33));
  }
  
}
