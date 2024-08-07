package Arrays;

public class EquilibriumPoint {

  public static boolean isequilibrium(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
      int ls=0,rs=0;
      for(int j=0;j<i;j++)
        ls+=arr[j];
      for(int k=i+1;k<n;k++)
        rs+=arr[k];
    if(ls==rs)
    return true;
    }
    return false;
  }

  public static boolean epoint(int arr[]){
    int n=arr.length;
    int rs=0;
    for(int i=0;i<n;i++){
      rs+=arr[i];
    }
    int ls=0;
    for(int i=0;i<n;i++){
      rs-=arr[i];
      if(ls==rs) return true;
      ls+=arr[i];
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[]={3,4,8,-9,9,7};
    System.out.println(epoint(arr));
  }
}
