package Arrays;

public class LeaderinArray {

  public static void leader(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
      boolean flag=false;
      for(int j=i+1;j<n;j++){
        if(arr[i]<=arr[j]){
          flag=true;
          break;
        }
      }
      if(flag==false){
        System.out.print(arr[i]+" ");
      }
    }
  }

  public static void Leader(int arr[]){
    int n=arr.length;
    int currLead=arr[n-1];
    System.out.print(currLead+" ");
    for(int i=n-2;i>=0;i--){
      if(currLead<arr[i]){
        currLead=arr[i];
        System.out.print(currLead+" ");
      }
    }
  }

  public static void main(String[] args) {
    int arr[]={7,10,4,10,6,5,2};
    leader(arr);
    System.out.println();
    Leader(arr);
  }

}
