/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
         Stack<Integer> s=new Stack<>();
         ListNode v=head;
         while(v !=null)
         {
           s.add(v.val);
           v=v.next;
         }
         v=head;
         while(v!=null)
         {
            v.val=s.pop();
            v=v.next;
         }

         return head;
    }
}
