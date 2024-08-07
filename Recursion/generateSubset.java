package Recursion;

public class generateSubset {

  public static void subSet(String str, String curr,int i) {
    if(i==str.length()){
      System.out.print(curr+" ");
      return;
    }
    subSet(str, curr, i+1);
    subSet(str, curr+str.charAt(i), i+1);
  }

  public static void main(String[] args) {
    subSet("ABC", " ", 0);
  }
  
}
