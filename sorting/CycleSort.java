package sorting;

public class CycleSort {

  static void cycleSort(int arr[],int n){
    for(int cs=0;cs<n-1;cs++){
      int item=arr[cs];
      int pos=cs;
      for(int i=cs+1;i<n;i++){
        if(arr[i]<item){ pos++;}
      }
      swap(arr, item, arr[pos]);
      while(pos!=cs){
        pos=cs;
        for(int i=cs+1;i<n;i++){
          if(arr[i]<item){pos++;}
        }
        swap(arr,item,arr[pos]);
      }
    }
  }

  static void swap(int arr[],int item,int pos){
    int temp=item;
    item=arr[pos];
    arr[pos]=temp;
  }

  public static void main(String[] args) {
    int arr[]={55,65,33,20,21,44,5,85,7,12,10};
    cycleSort(arr, arr.length);
    QuickSort.printArray(arr);
  }
  
}
