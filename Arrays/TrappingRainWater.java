package Arrays;

public class TrappingRainWater {

  public static int getWater(int arr[]){
    int n=arr.length;
    int res=0;
    for(int i=1;i<n-1;i++){
      int lmax=arr[i];
      for(int j=0;j<i;j++)
        lmax=Math.max(lmax,arr[j]);
      int rmax=arr[i];
      for(int j=i+1;j<n;j++)
        rmax=Math.max(rmax, arr[j]);
      res=res+Math.min(lmax, rmax)-arr[i];
    }
    
    return res;
  }

  public static int getmaxWater(int arr[]){
    int n=arr.length;
    int res=0;
    int lmax[] = new int[n];
    int rmax[] = new int [n];
    lmax[0]=arr[0];
    for(int i=1;i<n;i++){
      lmax[i]=Math.max(arr[i], lmax[i-1]);
    }
    rmax[n-1]=arr[n-1];
    for(int i=n-2;i>=0;i--){
      rmax[i]=Math.max(arr[i], rmax[i+1]);
    }
    for(int i=1;i<n-1;i++){
      res=res+Math.min(lmax[i], rmax[i])-arr[i];
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[]={1,2,3,4,0,6};
    System.out.println(getWater(arr));
    System.out.println(getmaxWater(arr));
    
  }
  
}
