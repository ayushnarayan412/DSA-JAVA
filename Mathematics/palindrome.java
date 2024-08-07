package Mathematics;
import java.util.*;

class palindrome{

  public static boolean ispalindrome(int n){
    int rev=0;
    int temp=n;
    while (temp!=0) {
      int remainder=temp%10;
      rev=rev*10+remainder;
      temp=temp/10;
    }
    if(rev==n){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number to check palindrome: ");
    int n=sc.nextInt();
    sc.close();
    if(ispalindrome(n)){
      System.out.println("Number is palindrome");
    }
    else{
      System.out.println("Number is not palindrome");
    }
  }
}