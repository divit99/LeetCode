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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        if(k==0)return head;
        ListNode temp=head;
        int length=0;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        length++;
        //
        k=k%length;
        temp.next=head;
        int rotation=length-k;
        //System.out.print(rotation);
        while(rotation>1){
            head=head.next;
            rotation--;
        }
        ListNode ans=head.next;
        head.next=null;
        return ans;
        
        
    }
}