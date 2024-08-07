package Searching;

public class Countoccurences {

  public static int countocc(int arr[],int x){
    int first=IndexofFirstOccurence.Firstocc(arr,x);
    if(first==-1){
      return 0;
    } else{
      int last=IndexofLastOccurence.Lastocc(arr, x);
      return (last-first+1);
    }
  }
  public static void main(String[] args) {
    int arr[]={10,20,20,20,30,30};
    int res=countocc(arr, 20);
    System.out.println(res);
  }
  
}
