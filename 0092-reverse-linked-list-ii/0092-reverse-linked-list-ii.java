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
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left==right)return head;
        ListNode res=new ListNode(-1);
        res.next=head;
        ListNode prerev=res;
        ListNode revend=res; 
        for(int i=0;i<left-1;i++){
            prerev=prerev.next;
        }
        for(int i=0;i<right;i++){
            revend=revend.next;
        }
        ListNode substart=prerev.next;
        ListNode beforeend=revend.next;
        revend.next=null;
        prerev.next=reverse(substart);
        
        substart.next=beforeend;
        return res.next;

    }
}