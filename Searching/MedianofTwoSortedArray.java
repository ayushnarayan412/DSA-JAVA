package Searching;

public class MedianofTwoSortedArray {
  public static double getMed(int a1[],int a2[]){
    int n1=a1.length,n2=a2.length;
    int begin1=0,end1=n1;
    while(begin1<=end1){
      int i1=(begin1+end1)/2;
      int i2=(n1+n2+1)/2-i1;
      int min1=(i1==n1)?Integer.MAX_VALUE : a1[i1];
      int max1=(i1==0)? Integer.MIN_VALUE : a1[i1-1];
      int min2=(i2==n2)?Integer.MAX_VALUE : a2[i2];
      int max2=(i2==0)?Integer.MIN_VALUE : a2[i2-1];
      if(max1<=min2 && max2<=min1){
        if((n1+n2)%2==0){
          return ((double)Math.max(max1, max2)+Math.min(min1,min2))/2;
        } else{
          return (double)Math.max(max1,max2);
        }
      }
      else if(max1>max2){
        end1=i1-1;
      } else{
        begin1=i1+1;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int a1[]={10,20,30};
    int a2[]={5,15,25,35,45};
    System.out.println(getMed(a1, a2));
  }

}
