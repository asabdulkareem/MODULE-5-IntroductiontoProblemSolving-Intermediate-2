import unittest
from src.day48.Exercise import Exercise
class test_Exercise(unittest.TestCase):
    def setUp(self): self.exercise = Exercise()
    def test_ex1_frequency_of_element_query_returns_counts_for_each_query(self):
        arr = [1, 2, 2, 3, 2]
        queries = [1, 2, 4]
        self.assertEqual(self.exercise.ex1FrequencyOfElementQuery(arr, queries), [1, 3, 0])

    def test_ex1_frequency_with_empty_array_returns_zero_counts(self):
        self.assertEqual(self.exercise.ex1FrequencyOfElementQuery([], [1, 0]), [0, 0])

    def test_ex2_first_repeating_element_returns_leftmost_repeating_value(self):
        arr = [10, 5, 3, 4, 3, 5, 6]
        self.assertEqual(self.exercise.ex2FirstRepeatingElement(arr), 5)

    def test_ex2_first_repeating_element_returns_minus_one_when_none(self):
        self.assertEqual(self.exercise.ex2FirstRepeatingElement([1, 2, 3, 4]), -1)
        self.assertEqual(self.exercise.ex2FirstRepeatingElement([42]), -1)

    def test_ex2_first_repeating_element_handles_all_duplicates(self):
        self.assertEqual(self.exercise.ex2FirstRepeatingElement([1, 1, 1]), 1)

    def test_ex3_subarray_with_zero_sum_detects_zero_sum_subarray(self):
        self.assertTrue(self.exercise.ex3SubArrayWith0Sum([1, 2, -3]))
        self.assertTrue(self.exercise.ex3SubArrayWith0Sum([0]))
        self.assertFalse(self.exercise.ex3SubArrayWith0Sum([1, 2, 3]))

    def test_ex5_count_unique_elements_returns_correct_counts(self):
        self.assertEqual(self.exercise.ex5CountUniqueElements([1, 2, 2, 3]), 3)
        self.assertEqual(self.exercise.ex5CountUniqueElements([]), 0)
        self.assertEqual(self.exercise.ex5CountUniqueElements([-1, -1, 0]), 2)