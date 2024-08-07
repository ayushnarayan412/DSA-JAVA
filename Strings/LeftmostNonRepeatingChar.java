package Strings;

import java.util.Arrays;

public class LeftmostNonRepeatingChar {
  static int CHAR = 256;

  static int nonRep(String str){
    int []findex=new int[CHAR];
    Arrays.fill(findex,-1);
    for(int i=0;i<str.length();i++){
      if(findex[str.charAt(i)]==-1)
      findex[str.charAt(i)]=i;
      else
      findex[str.charAt(i)]=-2;
    }
    int res=Integer.MAX_VALUE;
    for(int i=0;i<CHAR;i++){
      if(findex[i]>=0)
      res=Math.min(findex[i], res);
    }
    return (res==Integer.MAX_VALUE)?-1:res;
  }

  public static void main(String[] args) {
    String str="aabbcdef";
    System.out.println(nonRep(str));
  }
}
