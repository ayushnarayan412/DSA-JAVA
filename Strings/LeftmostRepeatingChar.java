package Strings;

import java.util.Arrays;

public class LeftmostRepeatingChar{
  static int CHAR=256;

  
  static int leftmost(String str){
    for(int i=0;i<str.length();i++){
      for(int j=i+1;j<str.length();j++){
        if(str.charAt(i)==str.charAt(j))
        //return index of leftmost element which is repeating
        return i;
      }
    }
    return -1;
  }
  static int LeftMost(String str){
    int findex[]=new int[CHAR];
    Arrays.fill(findex,-1);
    int res=Integer.MAX_VALUE;
    for(int i=0;i<str.length();i++){
      int fi=findex[str.charAt(i)];
      if(fi==-1)
      findex[str.charAt(i)]=i;
      else res=Math.min(res, fi);
    }
    return (res==Integer.MAX_VALUE)?-1:res;
  }

  static int leftMost(String str){
    boolean visited[]=new boolean[CHAR];
    int res=-1;
    for(int i=str.length()-1;i>=0;i--){
      if(visited[str.charAt(i)])
      res=i;
      else
      visited[str.charAt(i)]=true;
    }
    return res;
  }

  public static void main(String[] args) {
    String str="czbbad";
    System.out.println(leftmost(str));
    System.out.println(LeftMost(str));
    System.out.println(leftMost(str));
  }
}
