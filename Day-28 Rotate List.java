class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        int length=1;
        while(node.next!=null){
            node=node.next;
            length++;
        }
        node.next = head;

        ListNode temp = head;
        int rotations = k%length;
        int n = length-rotations;
        for(int i=0;i<n-1;i++){
            temp = temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}
