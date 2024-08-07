package setBits;

public class countSetBits {

  //Brian keningam's Algorithm
  public static int countBit(int n){
    int res=0;
    while(n>0){
      n=n&(n-1);
      res=res+1;
    }
    return res;
  }

  //Lookup Table solution
  public static int countbit(int n){

    return 0;
  }

  public static void main(String[] args) {
    System.out.println(countBit(40));
  }
  
}
