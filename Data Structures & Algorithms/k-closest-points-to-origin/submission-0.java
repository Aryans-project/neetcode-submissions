class Solution {
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[2]-b[2]);
       int[][] ans=new int[k][2];
       for(int i=0;i<points.length;i++)
       {
        int x=points[i][0];
        int y=points[i][1];
        int s=(x*x)+(y*y);
        q.offer(new int[]{x,y,s});
       }
       for(int i =0;i<k;i++)
       {
        int[] a=q.poll();
        ans[i][0]=a[0];
        ans[i][1]=a[1];
       }

       return ans;
    }
}
