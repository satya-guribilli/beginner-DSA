# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        len_headA, len_headB = 0,0
        curr = headA
        while curr:
            len_headA, curr =  len_headA+1 , curr.next
        curr = headB
        while curr:
            len_headB, curr = len_headB+1 , curr.next

        bignode  = headA if len_headA > len_headB else headB
        smallnode=  headA if len_headA <= len_headB else headB

        for i in range(abs(len_headA - len_headB)):
            bignode = bignode.next

        while bignode and smallnode:
            if bignode == smallnode: return bignode
            bignode, smallnode = bignode.next , smallnode.next
        return None