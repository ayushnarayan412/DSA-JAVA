package Searching;

import java.util.Arrays;

public class BinarySearch {
  public static int bsearch(int arr[],int x){
    int low=0,high=arr.length-1;
    while(low<=high){
      int mid=(low+high)/2;
      if(arr[mid]==x){
        return mid;
      }
      if(arr[mid]>x){
        high=mid-1;
      }
      if(arr[mid]<x){
        low=mid+1;
      }
    }
    return -1;
  }

  public static int recBsearch(int arr[],int low,int high,int x){
    if(low>high){
      return -1;
    }
    int mid=(low+high)/2;
    if(arr[mid]==x){
      return mid;
    }
    else if(arr[mid]>x){
      return recBsearch(arr, low, mid-1, x);
    }
    else{
      return recBsearch(arr, low+1, high, x);
    }
  }

  public static void main(String[] args) {
    int arr[]={10,20,30,40,50};
    System.out.println(bsearch(arr, 10));
    System.out.println(recBsearch(arr, 0, arr.length-1, 20));
    int key=20;
    //built in function for binary search
    int index = Arrays.binarySearch(arr,key);
    System.out.println(index);
  }
  
}
