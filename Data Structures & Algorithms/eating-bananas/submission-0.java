class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r=Arrays.stream(piles).max().getAsInt();
        int l=1;
        int ans=r;
        while(l<=r)
        {
           int k=l+(r-l)/2;
           
           long totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
                }

           if(totalTime>h)
           {
              l=k+1;
           }
           else
           {
             ans=k;
             r=k-1;
           }


        }
        return ans;
    }

}
