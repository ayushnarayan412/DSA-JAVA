package Mathematics;
import java.util.*;

class trailingZeroesoInFactorial {

  public static int countZero(int n){
    long fact=1;
    int res=0; 
    for(int i=2;i<=n;i++){
      fact=fact*i;
    }
    while(fact%10==0){
      res++;
      fact=fact/10;
    }
    return res;
  }

  public static int efficientWay(int n){
    int res=0;
    for(int i=5;i<=n;i=i*5){
      res=res+n/i;
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number: "); 
    int n=sc.nextInt();
    sc.close();
    //System.out.println("Number of zero is : "+countZero(n)); does not  work for n=251
    System.out.println("Number of zero is : "+efficientWay(n));
  }
  
}
