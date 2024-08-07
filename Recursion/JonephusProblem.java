package Recursion;

public class JonephusProblem {

  public static int jos(int n,int k){
    if(n==1){
      return 0;
    }

    return (jos(n-1,k)+k)%n;
  }
  public static int myJos(int n,int k){
    return jos(n, k)+1;
  }

  public static void main(String[] args) {
    //index start from zero
    System.out.println(jos(5,3));
    //index start from one
    System.out.println(myJos(5, 3));
  }
  
}
