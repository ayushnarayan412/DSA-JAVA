package sorting;

public class CountingSot {

  static void countsort(int arr[],int n){
    int count[]=new int [10];
    for(int i=0;i<n;i++)
      count[arr[i]]++;
    for(int i=1;i<10;i++){
      count[i]=count[i]+count[i-1];
    }
    int output[]=new int[n];
    for(int i=n-1;i>=0;i--){
      output[count[arr[i]]-1]=arr[i];
      count[arr[i]]--;
    }
    for(int i=0;i<n;i++){
      arr[i]=output[i];
    }
  }

  public static void main(String[] args) {
    int arr[]={2,5,4,1,1,3,4,6,4,0};
    countsort(arr, arr.length);
    QuickSort.printArray(arr);
  }
  
}
