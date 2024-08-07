package Mathematics;

import java.util.*;

public class LCM {

  public static int lcm(int a,int b){
    int i=0;
    int res;
    do{
      i++;
      res=Math.max(a, b);
      res=i*res;
    }while((res%a)!=0 || (res%b)!=0);
    return res;
  }
//(a*b)=gcd(a,b)*lcm(a,b)
  public static int Lcm(int a,int b){
    return (a*b)/GCD.Gcd(a,b);
  } 

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter two integers : ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    sc.close();
    System.out.println(lcm(a, b));
    System.out.println(Lcm(a, b));
  }
  
}
