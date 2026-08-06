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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer> >ans=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();

        if(root==null)
        {
         return ans;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {

         TreeNode curr=q.poll();
         
         if(curr!=null)
         {

            sub.add(curr.val);
            if(curr.left!=null)
            {
              q.add(curr.left);
            }
            if(curr.right!=null)
            {
               q.add(curr.right);
            }
         }
         if(curr==null)
         {
            if(!q.isEmpty())
            {
            q.add(null);
            }
            ans.add(new ArrayList<>(sub));
            sub.clear();
           
         }

        }

      return ans;

    }
}
