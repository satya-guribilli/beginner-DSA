# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self,list1,list2):
        dummy  = ListNode()
        newnode = dummy

        while list1 and list2:
            if list1.val < list2.val:
                newnode.next = list1
                list1 = list1.next
            else:
                newnode.next = list2
                list2 = list2.next
            newnode = newnode.next
        if list1:
            newnode.next = list1
        if list2:
            newnode.next = list2
        return dummy.next



    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if not lists :
            return None 
        if len(lists)==1:
            return lists[0]

        mid = len(lists)//2
        left = self.mergeKLists(lists[:mid])
        right = self.mergeKLists(lists[mid:])

        return self.mergeTwoLists(left,right)