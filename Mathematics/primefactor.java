package Mathematics;

import java.util.*;

public class primefactor {

  public static void primeFactor(int n){
    for(int i=2;i<n;i++){
      if(primeNumber.isPrime(i)){
        int x=i;
        while(n%x==0){
          System.out.print(i+" ");
          x=x*i;
        }
      }
    }
  }

  public static void primeFactors(int n){
    if(n<=1){
      return;
    }
    for(int i=2;i*i<=n;i++){
      while(n%i==0){
        System.out.print(i+" ");
        n=n/i;
      }
    }
    if(n>1){
      System.out.print(n);
    }
  }
  public static void primeFactors1(int n){
    if(n<=1){
      return;
    }
    while(n%2==0){
      System.out.print("2 ");
      n=n/2;
    }
    while(n%3==0){
      System.out.print("3 ");
      n=n/3;
    }
    for(int i=5;i*i<=n;i=i+6){
      while(n%i==0){
        System.out.print(i+" ");
        n=n/i;
      }
      while(n%(i+2)==0){
        System.out.print((i+2)+" ");
        n=n/(i+2);
      }
    }
    if(n>1){
      System.out.print(n);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n = sc.nextInt();
    sc.close();
    primeFactor(n);
    System.out.println();
    primeFactors(n);
    System.out.println();
    primeFactors1(n);
  }
  
}
