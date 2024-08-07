package Arrays;

public class OperationsOnArray {

  public static int search(int arr[],int n,int ele){
    for(int i=0;i<n;i++){
      if(arr[i]==ele){
        return i;
      }
    }
    return -1;
  }
  
  public static int insert(int arr[],int n,int ele,int pos){
    for(int i=n-1;i>=pos-1;i--){
      arr[i+1]=arr[i];
    }
    arr[pos-1]=ele;
    return (n+1);
  }
}
