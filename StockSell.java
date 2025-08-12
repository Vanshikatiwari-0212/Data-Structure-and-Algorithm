public class StockSell{
    public static int maxPro(int prices[]){
      int bp=Integer.MAX_VALUE;
      int maxP=0;
      for(int i=0;i<prices.length;i++){
          if(bp<prices[i]){
           int p=prices[i]-bp;
           maxP=Math.max(maxP,p);

          }else{
            bp=prices[i];
          }
      }
      return maxP;
    }
public static void main(String []args){
int prices[]={7,1,5,3,6,4};
System.out.println(maxPro(prices));

}
}