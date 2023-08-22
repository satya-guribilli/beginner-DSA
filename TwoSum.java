/*   You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit.
 Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 */


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int carry = 0;
        while(l1!=null || l2 != null || carry != 0){
            int d1 = (l1 != null)?l1.val:0;
            int d2 = (l2 != null)?l2.val:0;
            int sum = d1 + d2 + carry;
            int d = sum%10;
            carry = sum/10;

            ListNode newlist = new ListNode(d);
            tail.next = newlist;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next:null;
            l2 = (l2 != null) ? l2.next:null;
        }
        ListNode res = head.next;
        head.next = null;
        return res;
    }
}