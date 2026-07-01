class Solution {
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> l1Stack = new Stack<>();
        
        while(l1 != null) {
            l1Stack.push(l1);
            l1 = l1.next;
        }
        
        Stack<ListNode> l2Stack = new Stack<>();
        
        while(l2 != null) {
            l2Stack.push(l2);
            l2 = l2.next;
        }
        
        int carry = 0;
        ListNode dummy = null;
        
        while(!l1Stack.isEmpty() || !l2Stack.isEmpty() ||  carry != 0) {
            int f = l1Stack.isEmpty() ? 0 : l1Stack.pop().val;
            int s = l2Stack.isEmpty() ? 0 : l2Stack.pop().val;
            
            int t = f + s + carry;
            
            ListNode newNode = new ListNode(t % 10);
            
            newNode.next = dummy;
            dummy = newNode;
            carry = t/10;
            
        }
        
        return dummy;
        
    }
}