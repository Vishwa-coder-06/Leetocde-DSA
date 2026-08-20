/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    static void createdup(Node head){
        Node temp=head;
        while(temp!=null){
            Node next=temp.next;
            Node newNode=new Node(temp.val);
            temp.next=newNode;
            newNode.next=next;
            temp=next;
        }
    }
    static void linkrandom(Node head){
        Node temp=head;
        while(temp!=null){
            Node copy=temp.next;
            if(temp.random!=null) copy.random=temp.random.next;
            else copy.random=null;
            temp=temp.next.next;
        }
    }
    static Node copy(Node head){
        Node temp=head;
        Node dummy=new Node(-1);
        Node res=dummy;
        while(temp!=null){
            Node copy=temp.next;
            res.next=copy;
            res=res.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummy.next;
    }
    public Node copyRandomList(Node head) {
        createdup(head);
        linkrandom(head);
        return copy(head);

    }
}