package Mathematics;

public class SieveOfEratosthenes {
  
  public static void printprimes(int n){
    for(int i=2;i<=n;i++){
      if(primeNumber.isPrime(i)){
        System.out.print(i+" ");
      }
    }
  }
  public static void main(String[] args) {
    printprimes(8);  
  }

}
