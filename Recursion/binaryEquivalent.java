package Recursion;

import java.util.*;

public class binaryEquivalent {

  public static void binary(int n){
    if(n==0){
      return;
    }
    binary(n/2);
    System.out.print(n%2);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter interger to convert to its binary equivalent : ");
    int n=sc.nextInt();
    sc.close();
    binary(n);
  }
  
}
