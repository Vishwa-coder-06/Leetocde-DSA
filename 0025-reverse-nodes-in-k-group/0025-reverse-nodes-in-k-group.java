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
    static ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode revstart=head;
        ListNode revend=head;
        ListNode res=new ListNode(-1);
        ListNode revprev=res;
        while(revend!=null){
        int count=1;
        while(count<k && revend!=null){
            count++;
            revend=revend.next;
        }
        if(revend==null){
            revprev.next=revstart;
            break;
        }
        ListNode afterend=revend.next;
        revend.next=null;

        revprev.next=reverse(revstart);
        revprev=revstart;

        revstart=afterend;
        revend=afterend;
        }
        return res.next;
    }
}