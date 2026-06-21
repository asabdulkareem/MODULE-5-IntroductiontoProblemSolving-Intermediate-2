class Exercise:
    class TreeNode:
        def __inti__(self, val):
            self.val = val
            self.left = None
            self.right = None

    def ex1InorderTraversal(self, root):
        if root is None:
            return []
        return self.ex1InorderTraversal(root.left) + [root.val] +  self.ex1InorderTraversal(root.right)

    def ex2PreOrderTraversal(self, root):
        if root is None:
            return []
        return [root.val] + self.ex1InorderTraversal(root.left) + self.ex1InorderTraversal(root.right)

    def ex3PostOrderTraversal(self, root):
        if root is None:
            return []
        return self.ex3PostOrderTraversal(root.left) + self.ex3PostOrderTraversal(root.right) + [root.val]

    def ex4TreeHeight(self, root):
        if root is None:
            return 0
        return 1 + max(self.ex4TreeHeight(root.left), self.ex4TreeHeight(root.right))

    def ex5NodesCount(self, root):
        if root is None:
            return 0
        return 1 + self.ex5NodesCount(root.left) + self.ex5NodesCount(root.right)