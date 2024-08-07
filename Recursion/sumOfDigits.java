package Recursion;

import java.util.Scanner;

public class sumOfDigits {

  public static int digitSum(int n) {
    if(n==0){
      return 0;
    }
    else{
      return (n%10)+digitSum(n/10);
    }
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter an integer : ");
    int n=sc.nextInt();
    sc.close();
    System.out.println(digitSum(n));
  }
  
}
