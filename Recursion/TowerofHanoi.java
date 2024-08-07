package Recursion;

public class TowerofHanoi {

  public static void move(int n,char A,char B,char C){
    if(n==1){
      System.out.println("Move 1 from "+A+" to "+C);
      return;
    }
    move(n-1, A, C, B);
    System.out.println("Move " +n+ " from "+A+" to "+C);
    move(n-1, B,A,C);
  } 

  public static void main(String[] args) {
    move(2, 'A', 'B', 'C');
    
  }

}
