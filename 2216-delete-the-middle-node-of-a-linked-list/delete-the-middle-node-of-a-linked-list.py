# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head

        if head is None or head.next is None:
            return 

        while fast and fast.next:
            temp = slow
            slow = slow.next
            fast = fast.next.next
        temp.next = slow.next
        return head
        