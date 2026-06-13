import unittest
from src.day50.Exercise import Exercise


class test_Exercise(unittest.TestCase):
	def setUp(self): self.exercise = Exercise()

	def test_ex1_fibonacci_handles_base_and_small_numbers(self):
		self.assertEqual(self.exercise.ex1findAthFibonacci(0), 0)
		self.assertEqual(self.exercise.ex1findAthFibonacci(1), 1)
		self.assertEqual(self.exercise.ex1findAthFibonacci(2), 1)
		self.assertEqual(self.exercise.ex1findAthFibonacci(6), 8)

	def test_ex2_factorial_returns_correct_values_for_small_inputs(self):
		self.assertEqual(self.exercise.ex2Factorial(1), 1)
		self.assertEqual(self.exercise.ex2Factorial(5), 120)
		self.assertEqual(self.exercise.ex2Factorial(6), 720)

	def test_ex3_palindrome_recognition_for_various_strings(self):
		self.assertEqual(self.exercise.ex3PalindromeUsingRecursion(""), 1)
		self.assertEqual(self.exercise.ex3PalindromeUsingRecursion("a"), 1)
		self.assertEqual(self.exercise.ex3PalindromeUsingRecursion("aba"), 1)
		self.assertEqual(self.exercise.ex3PalindromeUsingRecursion("racecar"), 1)
		self.assertEqual(self.exercise.ex3PalindromeUsingRecursion("ab"), 0)
		self.assertEqual(self.exercise.ex3PalindromeUsingRecursion("hello"), 0)

	def test_ex4_print_1_to_A_formats_sequence_correctly(self):
		self.assertEqual(self.exercise.ex4Print1ToAFunction(1), '1')
		self.assertEqual(self.exercise.ex4Print1ToAFunction(3), '1 2 3')

	def test_ex5_print_A_to_1_formats_sequence_correctly(self):
		self.assertEqual(self.exercise.ex5PrintATo1Function(1), '1')
		self.assertEqual(self.exercise.ex5PrintATo1Function(4), '4 3 2 1')

	def test_reversedString_reverses_lists_in_place_for_even_and_odd_lengths(self):
		lst_even = [1, 2, 3, 4]
		result_even = self.exercise.reversedString(lst_even, 0, len(lst_even) - 1)
		self.assertEqual(result_even, [4, 3, 2, 1])

		lst_odd = list('abc')
		result_odd = self.exercise.reversedString(lst_odd, 0, len(lst_odd) - 1)
		self.assertEqual(result_odd, ['c', 'b', 'a'])
