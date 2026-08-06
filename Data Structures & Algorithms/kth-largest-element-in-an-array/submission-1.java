class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int num:nums)
        {
          q.offer(num);
        }
        for(int i=1;i<nums.length-k+1;i++)
        {
           q.poll();
        }

        return q.poll();
    }
}
