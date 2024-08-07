package Arrays;

public class SubarrayWithgivensum {

  public static boolean isSubsum(int arr[],int sum){
    int n=arr.length;
    for(int i=0;i<n;i++){
      int curr=0;
      for(int j=i;j<n;j++){
        curr+=arr[j];
        if(curr==sum){
          return true;
        }
      }
    }
    return false;
  }

  public static boolean isSum(int arr[],int sum){
    int currSum=0;
    int n=arr.length;
    int start=0;
    int i=0;
    while(i<n){
      if(sum>currSum){
        currSum+=arr[i];
        i++;
      }
      if(sum<currSum){
        currSum-=arr[start];
        start++;
      }
      if(sum==currSum){
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[]={4,8,12,5};
    System.out.println(isSubsum(arr, 17));
    System.out.println(isSum(arr, 17));
  }
  
}
