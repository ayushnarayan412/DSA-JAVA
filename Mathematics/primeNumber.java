package Mathematics;

import java.util.*;

public class primeNumber {

  public static boolean isPrime(int n){
    if(n==1){
      return false;
    }
    for(int i=2;i<n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }

  //Efficient way
  public static boolean isPrime1(int n){
    if(n==1){
      return false;
    }
    for(int i=2;i*i<=n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  //more efficient way
  public static boolean isPrime2(int n){
    if(n==1){
      return false;
    }
    if(n==2 || n==3){
      return true;
    }
    if(n%2==0 || n%3==0){
      return false;
    }
    for(int i=5;i*i<=n;i=i+6){
      if(n%i==0 || n%(i+2)==0){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a integer to check prime : ");
    int a=sc.nextInt();
    sc.close();
    if(isPrime2(a)){
      System.out.println("Prime Number");
    }
    else{
      System.out.println("Not Prime Number");
    }
  }
  
}
