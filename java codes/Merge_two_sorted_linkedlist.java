class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode =new ListNode(0);
        ListNode head = dummyNode;
        while( l1!=null && l2!=null){
            ListNode node;
            if(l1.val < l2.val){
                node = new ListNode(l1.val);
                l1=l1.next;
            }
            else if(l1.val > l2.val){
                node = new ListNode(l2.val);
                l2=l2.next;
            }
            else{
                node = new ListNode(l1.val);
                ListNode node1 = new ListNode(l2.val);
                dummyNode.next = node1;
                dummyNode = node1;
                l1=l1.next;
                l2=l2.next;
            }
             dummyNode.next = node;
                dummyNode = node;
        }
        
        if(l1==null && l2!=null){
            dummyNode.next = l2;
        }
        if(l1!=null && l2==null){
            dummyNode.next = l1;
        }
        
        return head.next;
    }
}
