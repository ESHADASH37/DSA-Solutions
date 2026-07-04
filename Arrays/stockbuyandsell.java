public class  stockbuyandsell {
    public static int stockbuymoney(int [] prices){
        int maxprofit=0;
        int minimalprice=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<minimalprice){
                minimalprice=prices[i];
            }
            else if(prices[i]-minimalprice>maxprofit){
                maxprofit=prices[i]-minimalprice;
            }

        }
        return maxprofit;
    }
    public static void main(String args[]){
        int[] prices={7, 1, 5, 3, 6, 4};
        int result=stockbuymoney(prices);

        System.out.println("The maximum profit achieved is:"+result);
    }    
}

