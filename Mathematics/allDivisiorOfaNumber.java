package Mathematics;

public class allDivisiorOfaNumber {

  public static void divisor(int n){
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
        System.out.print(i+" ");
        if(i!=n/i){
          System.out.print(n/i+" ");
        }
      }
    }
  }

  public static void Divisor(int n){
    int i;
    for(i=1;i*i<n;i++){
      if(n%i==0){
        System.out.print(i+" ");
      }}
      for( ; i>=1;i--){
        if(n%i==0){
          System.out.print(n/i+" ");
        }
      }
    }

  public static void main(String[] args) {
    divisor(15);
  }

}
