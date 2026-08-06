/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    PriorityQueue<Integer> q=new PriorityQueue<>();
    int size=0;
    public int filler(TreeNode root)
    {


      if(root==null)
      {
         return 0;
      }

      q.add(root.val);

      return 1+filler(root.left)+filler(root.right);

      
    }
    public int kthSmallest(TreeNode root, int k) {
      filler(root);
       
        for(int i=0;i<k-1;i++)
        {
         q.poll();
        }

        return q.poll();
    }
}
