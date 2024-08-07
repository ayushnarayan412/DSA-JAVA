package setBits;

public class powerof2 {

  public static boolean ispoweroftwo(int n){
    if(n==0){
      return false;
    }
    return ((n&(n-1))==0);
  }

  public static void main(String[] args) {
    if(ispoweroftwo(128)){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
  
}
