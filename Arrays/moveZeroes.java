package Arrays;



public class moveZeroes {

  public static void swap(int a,int b) {
    int temp=a;
    a=b;
    b=temp;
   // System.out.println(a+" "+b);
  }

  public static void moveToEnd(int arr[]){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==0){
        for(int j=i+1;j<arr.length;j++){
          if(arr[j]!=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
      }
    }
  }

  public static void move0(int arr[]){
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        int temp=arr[i];
          arr[i]=arr[count];
          arr[count]=temp;
          count++;
      }
    }
  }

  public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args) {
    int arr[]={1,0,0,2,3,4,0,4};
    // moveToEnd(arr);
    // print(arr);
    move0(arr);
    System.out.println();
    print(arr);
  }
  
}
