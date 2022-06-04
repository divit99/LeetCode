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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)return null;
       // if(n==1)return head.next;
        
        ListNode last=head,ans=head;
        while(last!=null&&n!=0){
            last=last.next;
            n--;
        }
        
       if(last==null)return head.next;
        
        while(last.next!=null){
            ans=ans.next;
            last=last.next;
        }
       // return ans;
          if(ans.next==null)ans=null;
         else ans.next=ans.next.next;
         return head;
        
    }
}

        // if (head.next == null) {
        //     return null;
        // }
        // ListNode slow = head; 
        // ListNode fast = head;
        // for (int i = 0; i < n; i++) {
        //     fast = fast.next;//make fast pointer n node apart from slow pointer
        // }
        // if (fast == null) {
        //     return head.next;
        // }
        // while (fast.next != null) { //while fast pointer reaches end of the list
        //     slow = slow.next;       //incrementing pointers
        //     fast = fast.next;
        // }
        // slow.next = slow.next.next; //now slow pointer will reach exactly at n nodes from end of the list
        // return head;