class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones)
        {
            q.offer(num);
        }

        while(q.size()>=2)
        {
            int val1=q.poll();
            int val2=q.poll();

            if(val1<val2)
            {
               val2=val2-val1;
               q.offer(val2);
            }
            else if(val1>val2)
            {
              val1=val1-val2;
              q.offer(val1);
            }
        }
         if(q.size()==0)
         {
            return 0;
         }
        return q.poll();
    }
}
