package setBits;

public class oddoneoccuring {
  public static int findodd(int arr[]){
    int res=arr[0];
    for(int i=1;i<arr.length;i++){
      res=res^arr[i];
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[]={4,4,7,4,8,7,7,7,8};
    System.out.println(findodd(arr));
  }
  
}
