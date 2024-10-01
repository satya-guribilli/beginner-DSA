# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        odd_head = head
        even_dummy = head.next
        even_head = head.next

        while even_head and odd_head and even_head.next and odd_head.next:
            odd_head.next , even_head.next = odd_head.next.next , even_head.next.next
            odd_head = odd_head.next
            even_head = even_head.next

        odd_head.next = even_dummy
        return head