package Recursion;

import java.util.Scanner;

public class sumOfNaturalNumbers {

  public static int sum(int n){
    if(n==0){
      return 0;
    }
    else{
      return n+sum(n-1);
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter interger : ");
    int n=sc.nextInt();
    sc.close();
    int res=sum(n);
    System.out.println(res);
  }
}
