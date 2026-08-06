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
    public static int count(TreeNode root, int max)
    {
      if(root==null)
      {
            return 0; 
      }
        int good=0;
        if(root.val>=max)
        {
            good=1;
        }
      max=Math.max(root.val,max);

      return good+count(root.right,max)+count(root.left,max);

    }
    public int goodNodes(TreeNode root) {
        int ans=count(root,root.val);

        return ans;
    }
}
