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
    public ListNode removeElements(ListNode head, int val) {
       /* ListNode temp=head;
        if(temp==null)return head;
        ListNode prev=null;
        while(temp != null){
            if(temp.val==val){
                if(prev != null) System.out.println(temp.val + " , " + prev.val);
                if(prev == null) temp = temp.next;
                else prev.next=temp.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
        */
        ListNode res=new ListNode(-1),temp=res;
        temp.next=head;
        while(temp.next!=null){
            if(temp.next.val==val)temp.next=temp.next.next;
            else temp=temp.next;
        }
        return res.next;
    }
}