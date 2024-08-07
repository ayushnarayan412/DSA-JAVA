package sorting;

public class SelectionSort {
  public static void selectionSort(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
      int min_ind=i;
      for(int j=i+1;j<n;j++){
        if(arr[j]<arr[min_ind]){
          min_ind=j;
        }
      }
      BubbleSort.swap(arr, min_ind, i);
    }
  }


  public static void main(String[] args) {
    int arr[]={6,5,4,3,90,1};
    selectionSort(arr);
    for (int i : arr) {
      System.out.print(i+ " ");
    }
  }
  
}
