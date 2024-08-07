package Arrays;

public class prefixSum {
  //given a fixed array and multiple range sum queries,how to answer queries efficiently
  public static int getSum(int arr[],int l,int r){
    int res=0;
    for(int i=l;i<=r;i++){
      res+=arr[i];
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[]={2,8,3,9,6,5,4};
    System.out.println(getSum(arr, 1, 3));
  }

}
