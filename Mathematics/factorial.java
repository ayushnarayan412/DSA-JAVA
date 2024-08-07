package Mathematics;
import java.util.*;

class factorial {

  public static long fact(int n){
    //takes more auxiliary space than iterative approach
    if(n==0){
      return 1;
    }

    return n*fact(n-1);
  }

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number to find factorial : ");
    int n=sc.nextInt();
    sc.close();
    System.out.println("Factorial of number is : "+fact(n));
  }
  
}
