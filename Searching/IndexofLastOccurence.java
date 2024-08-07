package Searching;

public class IndexofLastOccurence {

  public static int lastoccurence(int arr[],int low,int high,int x){
    if(low>high) return -1;
    int mid=(low+high)/2;
    if(arr[mid]>x){
      return lastoccurence(arr, low, mid-1, x);
    } else if(arr[mid]<x){
      return lastoccurence(arr, mid+1, high, x);
    } else{
      if(mid==arr.length-1 || arr[mid]!=arr[mid+1]){
        return mid;
      } else{
        return lastoccurence(arr, mid+1 ,high, x);
      }
    }

  }

  public static int Lastocc(int arr[],int x){
    int low=0,high=arr.length-1;
    while(low<=high){
      int mid=(low+high)/2;
      if(arr[mid]>x){
        high=mid-1;
      } else if(arr[mid]<x){
        low=mid+1;
      } else{
        if(mid==arr.length-1 || arr[mid]!=arr[mid+1]){
          return mid;
        } else {
          low=mid+1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[]={5,10,10,10,20,20};
    System.out.println(Lastocc(arr, 10));
    System.out.println(lastoccurence(arr, 0, arr.length-1, 10));
  }
  
}
