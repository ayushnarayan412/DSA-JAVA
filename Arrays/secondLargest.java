package Arrays;

public class secondLargest {

  public static int secondlargest(int arr[]){
    int res=-1;
    int largest=0;
    for(int i=1;i<arr.length;i++){
      if(arr[i]>arr[largest]){
        res=largest;
        largest=i;
      }
      else if(arr[i]!=arr[largest]){
        if(res==-1 || arr[i]>arr[res]){
          res=i;
        }
      }
    }
    return res;
  }
  public static int Largest(int arr[]){
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
}

  public static void main(String[] args) {
    int arr[]={5,1,2,3,4};
    System.out.println(Largest(arr));
    System.out.println(secondlargest(arr));
  }
  
}
