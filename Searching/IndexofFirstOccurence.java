package Searching;

public class IndexofFirstOccurence {

  public static int FirstOccurence(int arr[],int x){
    int n=arr.length;
    for(int i=0;i<n;i++){
      if(arr[i]==x){
        return i;
      }
    }
    return -1;
  }
  public static int firstOcc(int arr[],int low,int high,int x){
    //using recursion
    if(low>high){
      return -1;
    }
    int mid=(low+high)/2;
    if(x>arr[mid]){
      return firstOcc(arr, mid+1, high, x);
    }
    else if(x<arr[mid]){
      return firstOcc(arr, low, mid-1, x);
    }
    else{
      if(mid==0 || arr[mid-1]!=arr[mid]){
        return mid;
      }
      else{
        return firstOcc(arr, low, mid-1, x);
      }
    }
  }

  public static int Firstocc(int arr[],int x){
    int n=arr.length;
    int low=0,high=n-1;
    while(low<=high){
      int mid=(low+high)/2;
      if(x>arr[mid]){
        low=mid+1;
      } else if(x<arr[mid]){
        high=mid-1;
      }
      else{
        if(mid==0 || arr[mid-1]!=arr[mid]){
          return mid;
        }
        else{
          high=mid-1;
        }
      }
    }
      return -1;
  }

  public static void main(String[] args) {
    int arr[]={5,10,10,20,20};
    System.out.println(firstOcc(arr, 0, arr.length-1, 20));
    System.out.println(FirstOccurence(arr, 20));
    System.out.println(Firstocc(arr, 20));
  }

}
