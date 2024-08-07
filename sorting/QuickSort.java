package sorting;

public class QuickSort {

 static void naivepartition(int arr[],int l,int h,int partitionIndex){
    int temp[]=new int[h-l+1];
    int index=0;
    int p=partitionIndex;
    for(int i=l;i<=h;i++){
      if(arr[i]<=arr[p]){
        temp[index]=arr[i];
        index++;
      }
    }

    for(int i=l;i<=h;i++){
      if(arr[i]>arr[p]){
        temp[index]=arr[i];
        index++;
      }
    }

    for(int i=l;i<=h;i++){
      arr[i]=temp[i-l];
    }

  }

  static int hoarsPartition(int arr[],int l,int h){
    int pivot=arr[l];
    int i=l-1;
    int j=h+1;
    while(true){
      do{
        i++;
      }while(arr[i]<pivot);
    do{
      j--;
    }while(arr[j]>pivot);
    if(i>=j)
    return j;
    swap(arr,i,j);
  }
  }

  //Lomuto partition
  static int partition(int arr[],int l,int h){
    int pivot=arr[h];
    int i=l-1;
    for(int j=l;j<=h-1;j++){
      if(arr[j]<pivot){
        i++;
        BubbleSort.swap(arr, i, j);
      }
    }
    BubbleSort.swap(arr, i+1, h);
    return (i+1);
  }

  public static void quick(int arr[],int l,int h){
    if(l<h){
      int p=partition(arr, l, h);
      quick(arr, l, p-1);
      quick(arr, p+1, h);
    }
  }

  static void qsort(int arr[],int l,int h){
    if(l<h){
      int p=hoarsPartition(arr, l, h);
      qsort(arr, l, p);
      qsort(arr, p+1, h);
    }
  }

  static void printArray(int arr[])
  {
      int n = arr.length;
      for (int i = 0; i < n; ++i)
          System.out.print(arr[i] + " ");
      System.out.println();
  }

  public static void swap(int arr[],int low,int high){
    int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
  }

  public static void main(String[] args) {
    int arr[]={55,65,33,20,21,44,5,85,7,12,10};
    qsort(arr, 0, arr.length-1);
    printArray(arr);
  }
}
