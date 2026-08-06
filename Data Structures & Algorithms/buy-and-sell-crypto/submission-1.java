class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int maxval=0;
        while(right<prices.length)
        {
            if(prices[left]>prices[right])
            {
                left=right;
            }
            else
            {
                 int val=prices[right]-prices[left];
                 if(val>maxval)
                 {
                    maxval=val;
                 }
            }
            right++;
        }
        return maxval;
    }
}
