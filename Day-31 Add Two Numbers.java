class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyhead=new ListNode();
        ListNode current = dummyhead;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int val1 =0;
            int val2=0;
            if(l1!=null){
                val1 = l1.val;
            }
            if(l2!=null){
                val2=l2.val;
            }
            int sum = val1+val2+carry;
            carry=sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return dummyhead.next;
    }
}
