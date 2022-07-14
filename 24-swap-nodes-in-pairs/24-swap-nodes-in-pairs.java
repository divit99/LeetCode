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
    public ListNode swapPairs(ListNode root) {
        
        if(root==null||root.next==null)return root;
        
        
        
        ListNode temp=root;
        root=root.next;
        temp.next=root.next;
        root.next=temp;
        temp.next=swapPairs(temp.next);
        return root;
        
    }
}