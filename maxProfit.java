class Solution {
    public int maxProfit(int[] prices) {
        //***** TLE***** */
        // int start=1;int end = 1; int diff = 0;
        // for(int i=0;i<prices.length-1;i++){
        //     start = i;
        //     for(int j = i+1;j<prices.length;j++){
        //         if((prices[j]-prices[start])>=diff){
        //             diff = (prices[j]-prices[start]);
        //             //System.out.println(diff);
        //             end = j;
        //         }
        //     }
        // }
        // if(diff<0) return 0;
        // return diff;
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i: prices){
            min = Math.min(i,min);
            profit = Math.max(i-min,profit);
        }
        return profit;

    }
}
