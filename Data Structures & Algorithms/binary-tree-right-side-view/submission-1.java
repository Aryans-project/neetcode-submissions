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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        q.add(root);
        q.add(null);
        ans.add(root.val);
        while(!q.isEmpty())
        {
           TreeNode curr=q.poll();
            if(curr!=null)
            {
              if(curr.right!=null)
              {
                q.add(curr.right);
              }
              if(curr.left!=null)
              {
                q.add(curr.left);
              }
            }
            else
            {
                if(!q.isEmpty())
                {
                    TreeNode c=q.peek();
                    ans.add(c.val);
                    q.add(null);
                }

            }

        }

        return ans;
    }
}
