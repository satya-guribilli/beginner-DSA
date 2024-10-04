# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:

        stack = []

        if not root:
            return 
        st = []
        st.append(root)

        while st:
            root = st.pop()
            stack.append(root.val)

            if root.right:
                st.append(root.right)
            if root.left:
                st.append(root.left)

        return stack
            

            

#         arr = []

#         preorder(root, arr)

#         return arr

# def preorder(root, arr):
#     if root is None:
#         return
            
#     arr.append(root.val)
#     preorder(root.left,arr)
#     preorder(root.right, arr)

        