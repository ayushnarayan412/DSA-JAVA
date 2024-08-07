package Arrays;

public class StockBuyAndSell {
  
  public static int maxProfit(int price[],int start,int end){
    if(end<=start){
      return 0;
    }
    int profit=0;
    for(int i=start;i<end;i++){
      for(int j=i+1;j<=end;j++){
        if(price[j]>price[i]){
          int currProfit=price[j]-price[i]+maxProfit(price,start,i-1)+maxProfit(price,j+1,end);
          profit=Math.max(profit, currProfit);
        }
      }
    }
    return profit;
  }

  public static int Maxprofit(int price[]){
    int n=price.length;
    int profit=0;
    for(int i=1;i<n;i++){
      if(price[i]>price[i-1]){
        profit=profit+(price[i]-price[i-1]);
      }
    }
    return profit;
  }

  public static void main(String[] args) {
    int price[]={1,5,3,8,12};
    System.out.println(maxProfit(price, 0, price.length-1));
    System.out.println(Maxprofit(price));
  }
  
}
