# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        last = None
        temp  = head
        while temp :
            front = temp.next
            temp.next  = last
            last = temp
            temp = front

        return last


        