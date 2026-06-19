import unittest
from src.day53.Exercise import Exercise


class ExerciseBehaviorTests(unittest.TestCase):
    def setUp(self):
        self.exercise = Exercise()

    def build_linked_list(self, values):
        head = None
        tail = None
        for value in values:
            node = Exercise.Node(value)
            node.Node = Exercise.Node
            if head is None:
                head = node
                tail = node
            else:
                tail.next = node
                tail = node
        return head

    def linked_list_values(self, head):
        values = []
        current = head
        while current is not None:
            values.append(current.data)
            current = current.next
        return values

    def test_search_returns_true_when_target_is_present(self):
        node = Exercise.Node(0)
        head = self.build_linked_list([10, 20, 30])
        self.assertTrue(node.ex2SearchInLinkedList(head, 20))

    def test_search_returns_false_when_target_is_absent(self):
        node = Exercise.Node(0)
        head = self.build_linked_list([10, 20, 30])
        self.assertFalse(node.ex2SearchInLinkedList(head, 99))

    def test_search_returns_false_for_empty_list(self):
        node = Exercise.Node(0)
        self.assertFalse(node.ex2SearchInLinkedList(None, 1))

    def test_insert_returns_single_node_for_empty_list(self):
        node = Exercise.Node(0)
        node.Node = Exercise.Node
        result = node.ex3InsertInLinkedList(None, 42, 0)
        self.assertEqual(self.linked_list_values(result), [42])

    def test_insert_places_new_value_at_head_when_index_is_zero(self):
        node = Exercise.Node(0)
        node.Node = Exercise.Node
        head = self.build_linked_list([20, 30])
        result = node.ex3InsertInLinkedList(head, 10, 0)
        self.assertEqual(self.linked_list_values(result), [10, 20, 30])

    def test_delete_returns_none_for_empty_list(self):
        node = Exercise.Node(0)
        self.assertIsNone(node.ex4DeleteInLinkedList(None, 0))

    def test_delete_removes_head_when_index_is_zero(self):
        node = Exercise.Node(0)
        head = self.build_linked_list([10, 20, 30])
        result = node.ex4DeleteInLinkedList(head, 0)
        self.assertEqual(self.linked_list_values(result), [20, 30])

    def test_delete_removes_middle_node(self):
        node = Exercise.Node(0)
        head = self.build_linked_list([10, 20, 30, 40])
        result = node.ex4DeleteInLinkedList(head, 2)
        self.assertEqual(self.linked_list_values(result), [10, 20, 40])

    def test_delete_leaves_list_unchanged_when_index_is_out_of_range(self):
        node = Exercise.Node(0)
        head = self.build_linked_list([10, 20, 30])
        result = node.ex4DeleteInLinkedList(head, 10)
        self.assertEqual(self.linked_list_values(result), [10, 20, 30])


