import unittest
from src.day46.Exercise import Exercise
class test_Exercise(unittest.TestCase):
    def setUp(self):
        self.exercise = Exercise()

    def test_ex1_elements_removal_computes_accumulated_sum_for_multiple_elements(self):
        self.assertEqual(self.exercise.ex1ElementsRemoval([3, 1, 2]), 10)

    def test_ex1_elements_removal_handles_empty_and_single_element(self):
        self.assertEqual(self.exercise.ex1ElementsRemoval([]), 0)
        self.assertEqual(self.exercise.ex1ElementsRemoval([5]), 5)

    def test_ex2_noble_integer_detects_noble_value(self):
        self.assertEqual(self.exercise.ex2NobleInteger([2, 1, 0]), 1)

    def test_ex2_noble_integer_returns_minus_one_when_no_noble(self):
        self.assertEqual(self.exercise.ex2NobleInteger([3, 2, 1]), -1)

    def test_ex2_noble_integer_handles_duplicates_without_noble(self):
        self.assertEqual(self.exercise.ex2NobleInteger([1, 1, 1]), -1)

    def test_ex3_factors_sort_orders_by_factor_count_then_value(self):
        self.assertEqual(self.exercise.ex3FactorsSort([6, 8, 9]), [9, 6, 8])

    def test_ex3_factors_sort_handles_empty_list(self):
        self.assertEqual(self.exercise.ex3FactorsSort([]), [])

    def test_ex4_largest_number_builds_expected_concatenation(self):
        self.assertEqual(self.exercise.ex4LargestNumber([3, 30, 34, 5, 9]), '9534330')

    def test_ex4_largest_number_returns_single_zero_for_all_zero_input(self):
        self.assertEqual(self.exercise.ex4LargestNumber([0, 0]), '0')

    def test_ex4_largest_number_places_940_before_409(self):
        self.assertEqual(self.exercise.ex4LargestNumber([940, 409]), '940409')