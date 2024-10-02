# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head is None or head.next is None:
            return head


        slow = head
        fast = head.next

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        middle = slow.next

        slow.next = None

        left = self.sortList(head)
        right = self.sortList(middle)

        
        
        
        
        dummy = ListNode(-1)

        temp = dummy

        while left and right:
            if left.val < right.val:
                temp.next = left
                left = left.next
            else:
                temp.next = right
                right = right.next
            temp = temp.next
            
        temp.next = left or right
            
        return dummy.next
        
        
            