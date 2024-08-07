package sorting;

public class KthSmallestElement {
  public static int partition(int arr[],int l,int h){
    int pivot=arr[h];
    int i=l-1;
    for(int j=l;j<=h-1;j++){
      if(arr[j]<pivot){
        i++;
        BubbleSort.swap(arr, j, i);
      }
    }
    BubbleSort.swap(arr, i+1, h);
    return (i+1);
  }
  public static int smallest(int arr[],int n,int k){
    int lo=0,hi=n-1;
    while (lo<=hi) {
      int p=partition(arr, lo, hi);
      if(p==k-1){
        return arr[p];
      }
      else if(p>k-1){
        hi=p-1;
      } else{
        lo=p+1;
      }
      
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[]={10,4,5,8,11,6,26};
    int res=smallest(arr, arr.length, 5);
    System.out.println(res);
  }
}
