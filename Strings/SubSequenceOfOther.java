package Strings;

public class SubSequenceOfOther {
  static boolean isSubSeq(String str, String s1 ){
    int j=0;
    for(int i=0;i<str.length() &&  j<s1.length();i++){
      if(str.charAt(i)==s1.charAt(j))
      j++;
    }    
    return (j==s1.length());
  }

  static boolean isSeq(String str,String s1,int n,int m){
    if(m==0)
    return true;
    if(n==0)
    return false;
    if(str.charAt(n-1)==s1.charAt(m-1))
    return isSeq(str,s1,n-1,m-1);
    else
    return isSeq(str, s1, n-1, m);
  } 

  public static void main(String[] args) {
    String str="ABCDEF";
    String s1="ADE";
    System.out.println(isSubSeq(str, s1));
    System.out.println(isSeq(str, s1, str.length(), s1.length()));
  }
}
