class Solution {
    public int maxProfit(int[] prices) {
        int maxval=0;
        for(int i=0;i<prices.length-1;i++)
        {
            int j=i+1;
            while(j<prices.length)
            {
            if(prices[j]>prices[i])
            {
                int val=prices[j]-prices[i];
                if(val>maxval)
                {
                    maxval=val;
                }
            }
            j++;
            }
        }
        return maxval;
    }
}
