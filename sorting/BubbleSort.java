package sorting;

public class BubbleSort {

  public static void bubbleSort(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
      boolean swapped=false;
      for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
          swap(arr, j, j+1);
          swapped=true;
        }
      }
      if(swapped==false)
          break;
    }
  }

  public static void swap(int arr[],int low,int high){
      int temp=arr[low];
          arr[low]=arr[high];
          arr[high]=temp;
    }
  
}

