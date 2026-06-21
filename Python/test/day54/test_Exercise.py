import unittest
from src.day54.Exercise import Exercise
class BinaryNode:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class ExerciseBehaviorTests(unittest.TestCase):
    def setUp(self):
        self.exercise = Exercise()
    def build_balanced_tree(self):
        return BinaryNode(
            1,
            BinaryNode(2, BinaryNode(4), BinaryNode(5)),
            BinaryNode(3, None, BinaryNode(6)),
        )
    def test_inorderTraversal_returns_empty_list_for_none_root(self):
        self.assertEqual(self.exercise.ex1InorderTraversal(None), [])
    def test_inorderTraversal_returns_left_root_right_sequence(self):
        root = self.build_balanced_tree()
        self.assertEqual(self.exercise.ex1InorderTraversal(root), [4, 2, 5, 1, 3, 6])
    def test_preOrderTraversal_returns_root_left_right_sequence(self):
        root = self.build_balanced_tree()
        self.assertEqual(self.exercise.ex2PreOrderTraversal(root), [1, 4, 2, 5, 3, 6])
    def test_postOrderTraversal_returns_left_right_root_sequence(self):
        root = self.build_balanced_tree()
        self.assertEqual(self.exercise.ex3PostOrderTraversal(root), [4, 5, 2, 6, 3, 1])
    def test_traversals_return_single_value_for_single_node(self):
        root = BinaryNode(7)
        self.assertEqual(self.exercise.ex1InorderTraversal(root), [7])
        self.assertEqual(self.exercise.ex2PreOrderTraversal(root), [7])
        self.assertEqual(self.exercise.ex3PostOrderTraversal(root), [7])
    def test_treeHeight_returns_zero_for_none_root(self):
        self.assertEqual(self.exercise.ex4TreeHeight(None), 0)
    def test_treeHeight_returns_max_depth_for_unbalanced_tree(self):
        root = BinaryNode(1, BinaryNode(2, BinaryNode(3, BinaryNode(4))), None)
        self.assertEqual(self.exercise.ex4TreeHeight(root), 4)
    def test_nodesCount_returns_zero_for_none_root(self):
        self.assertEqual(self.exercise.ex5NodesCount(None), 0)
    def test_nodesCount_returns_total_nodes_in_tree(self):
        root = self.build_balanced_tree()
        self.assertEqual(self.exercise.ex5NodesCount(root), 6)
def load_tests(loader, tests, pattern):
    suite = unittest.TestSuite()
    method_names = [
        "test_inorderTraversal_returns_empty_list_for_none_root",
        "test_inorderTraversal_returns_left_root_right_sequence",
        "test_preOrderTraversal_returns_root_left_right_sequence",
        "test_postOrderTraversal_returns_left_right_root_sequence",
        "test_traversals_return_single_value_for_single_node",
        "test_treeHeight_returns_zero_for_none_root",
        "treeHeight_returns_max_depth_for_unbalanced_tree",
        "test_nodesCount_returns_zero_for_none_root",
        "test_nodesCount_returns_total_nodes_in_tree",
    ]
    for method_name in method_names:
        suite.addTest(ExerciseBehaviorTests(method_name))
    return suite
