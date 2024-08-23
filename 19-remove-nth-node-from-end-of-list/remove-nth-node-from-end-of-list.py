# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """

        right = head
        left = head

        for i in range(n):
            right = right.next

        if not right:
            return head.next

        while right.next:
            right = right.next
            left = left.next

        left.next = left.next.next

        return head

        

        