package Mathematics;

import java.util.*;

public class GCD {

  public static int gcd(int a, int b) {
    int res = Math.min(a, b);
    while (res > 0) {
      if (a % res == 0 && b % res == 0) {
        break;
      }
      res--;
    }
    return res;
  }

  //Basic Euclidean algorithm
  public static int getGcd(int a, int b) {
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;
  }
  //Optimized Euclidean algorithm
  public static int Gcd(int a,int b){
    if(b==0){
      return a;
    }
    else{
      return Gcd(b,a%b);
    }
  }

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter two integers : ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    sc.close();
    System.out.println("GCD is: "+getGcd(a,b));
    System.out.println(Gcd(a, b));
  }

}
