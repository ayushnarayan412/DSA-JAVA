package Recursion;

import java.util.Scanner;

public class printNto1 {

  public static void print(int n){
    if(n==0){
      return;
    }
    System.out.print(n+" ");
    print(n-1);
  }
  public static void print1ToN(int n){
    if(n==0){
      return;
    }
    print1ToN(n-1);
    System.out.print(n+" ");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter interger : ");
    int n=sc.nextInt();
    sc.close();
    print(n);
    System.out.println();
    print1ToN(n);
  }
  
}
