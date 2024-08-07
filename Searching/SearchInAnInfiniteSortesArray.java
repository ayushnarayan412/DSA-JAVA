package Searching;

public class SearchInAnInfiniteSortesArray {

  public static int search(int arr[],int x){
    if(arr[0]==x) return 0;
    int i=1;
    while(arr[i]<x){
      i=i*2;
      if(arr[i]==x) return i;
    }
    return bSearch(arr, i/2+1, i, x);
  }

  public static int bSearch(int arr[],int low,int high,int x){
    while(low<=high){
      int mid=(low+high)/2;
      if(arr[mid]==x){
        return mid;
      } else if(arr[mid]>x){
        high =mid-1;
      } else{
        low=mid+1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[]={1,10,15,20,40,60,80,100,200,500,1000};
    System.out.println(search(arr, 100));
  }
  
}
