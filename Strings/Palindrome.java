package Strings;

public class Palindrome {
  static boolean ispalin(String str){
    StringBuilder rev=new StringBuilder(str);
    rev.reverse();
    return str.equals(rev.toString());
  }

  static boolean ispalindrome(String str){
    int low=0;
    int high=str.length()-1;
    while(low<=high) {
      if(str.charAt(low)!=str.charAt(high))
      return false;
      low++;
      high--;
    }
    return true;
  }

  public static void main(String[] args) {
    String str="AABBAA";
    System.out.println(ispalin(str));
    System.out.println(ispalindrome(str));
  }
}
