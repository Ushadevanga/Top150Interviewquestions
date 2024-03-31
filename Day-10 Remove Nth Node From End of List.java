class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node =head;
        int c=1;
        while(node.next!=null){
            node = node.next;
            c++;
        }
        if(c<n){
            return null;
        }
        if(c==n){
            return head.next;
        }
        int l = c-n;
        ListNode temp = head;
        while(l>1){
            temp = temp.next;
            l--;
        }
        if(temp.next!=null){
            temp.next = temp.next.next;
        }
        return head;
    }
}
