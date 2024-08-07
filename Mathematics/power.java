package Mathematics;

public class power {

  public static int calcPower(int x,int n){
    int res=1;
    for(int i=0;i<n;i++){
      res*=x;
    }
    return res;
  }

  public static int Calpower(int x,int n){
    if(n==0){
      return 1;
    }
    int temp=Calpower(x, n/2);
    temp=temp*temp;
    if(n%2==0){
      return temp;
    }
    else{
      return temp*x;
    }
  }
  public static int iterativepower(int x,int n){
    int res=1;
    while(n>0){
      if(n%2!=0){
        res=res*x;
      }
      x=x*x;
      n=n/2;
    }
    return res;
  }
  public static void main(String[] args) {
    System.out.println(calcPower(2, 2));
    System.out.println(Calpower(3, 5));
    System.out.println(iterativepower(3, 5));
  }

}
