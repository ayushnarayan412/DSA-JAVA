package Recursion;

public class permutationsOfString {

  public static String swap(String str,int i,int j){
    char[] c = str.toCharArray();

// Replace with a "swap" function, if desired:
    char temp = c[i];
    c[i] = c[j];
    c[j] = temp;
    return String.valueOf(c);
  }

  public static void permute(String str,int i) {
    if(i==str.length()){
      System.out.print(str+" ");
      return;
    }

    for(int j=i;j<str.length();j++){
      str=swap(str, i, j);
      permute(str, i+1);
      str=swap(str, i, j);
    }

  }

  public static void main(String[] args) {
    permute("ABCD", 0);
  }
}
