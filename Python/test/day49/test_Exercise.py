import unittest

from src.day49.Exercise import Exercise


class ExerciseTestCase(unittest.TestCase):
	def setUp(self):
		self.exercise = Exercise()

	def test_empty_input_returns_zero_for_longest_zero_sum_subarray(self):
		self.assertEqual(self.exercise.ex1LongestSubarrayZeroSum([]), 0)

	def test_all_zero_values_return_the_full_length_for_longest_zero_sum_subarray(self):
		self.assertEqual(self.exercise.ex1LongestSubarrayZeroSum([0, 0, 0]), 3)

	def test_mixed_values_return_the_longest_zero_sum_subarray_length(self):
		self.assertEqual(
			self.exercise.ex1LongestSubarrayZeroSum([1, 2, -3, 3, 1, -4, 2, 2]),
			6,
		)

	def test_pair_sum_finds_a_matching_pair(self):
		self.assertTrue(self.exercise.ex2CheckPairSum([1, 4, 6, 8], 10))

	def test_pair_sum_handles_duplicate_values_for_a_double_target(self):
		self.assertTrue(self.exercise.ex2CheckPairSum([5, 5, 1], 10))

	def test_pair_sum_returns_false_when_no_pair_matches(self):
		self.assertFalse(self.exercise.ex2CheckPairSum([1, 2, 3, 9], 8))

	def test_distinct_numbers_in_a_single_window_returns_the_unique_count(self):
		self.assertEqual(self.exercise.ex3DistinctNumbersInWindow([1, 2, 1, 3], 4), [3])

	def test_distinct_numbers_in_sliding_windows_returns_counts_for_each_window(self):
		self.assertEqual(
			self.exercise.ex3DistinctNumbersInWindow([1, 2, 1, 3, 4, 2, 3], 4),
			[3, 4, 4, 3],
		)

	def distinct_numbers_in_window_size_one_returns_one_for_each_position(self):
		self.assertEqual(self.exercise.ex3DistinctNumbersInWindow([5, 6, 5], 1), [1, 1, 1])


def test_load_tests(loader, tests, pattern):
	suite = unittest.TestSuite()
	test_names = [
		"test_empty_input_returns_zero_for_longest_zero_sum_subarray",
		"test_all_zero_values_return_the_full_length_for_longest_zero_sum_subarray",
		"test_mixed_values_return_the_longest_zero_sum_subarray_length",
		"test_pair_sum_finds_a_matching_pair",
		"test_pair_sum_handles_duplicate_values_for_a_double_target",
		"test_pair_sum_returns_false_when_no_pair_matches",
		"test_distinct_numbers_in_a_single_window_returns_the_unique_count",
		"test_distinct_numbers_in_sliding_windows_returns_counts_for_each_window",
		"test_distinct_numbers_in_window_size_one_returns_one_for_each_position",
	]
	for name in test_names:
		suite.addTest(ExerciseTestCase(name))
	return suite

