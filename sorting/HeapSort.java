package sorting;

public class HeapSort {

  static void maxheapify(int arr[],int n,int i){
    int largest=i;
    int left=2*i+1;
    int right=2*i+2;
    if(left<n && arr[left]>arr[largest]){
      largest=left;
    }
    if(right<n && arr[right]>arr[largest]){
      largest=right;
    }
    if(largest!=i){
      BubbleSort.swap(arr, largest, i);
      maxheapify(arr, n, largest);
    }
  }
  
  static void buildheap(int arr[],int n){
    for(int i=(n-2)/2;i>=0;i++){
      maxheapify(arr, n, i);
    }
  }

  static void heapsort(int arr[],int n){
    buildheap(arr, n);
    for(int i=n-1;i>=1;i++){
      BubbleSort.swap(arr, 0, i);
      maxheapify(arr, i, 0);
    }
  }

  public static void main(String[] args) {
    int arr[]={12,11,10,9};
    heapsort(arr, arr.length);
    QuickSort.printArray(arr);
  }
}
