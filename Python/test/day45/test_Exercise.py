import unittest
from src.day45.Exercise import Exercise


class ExerciseBehaviorTests(unittest.TestCase):
	def setUp(self):
		self.exercise = Exercise()

	def test_ex1_power_with_modules_returns_correct_modular_power(self):
		self.assertEqual(self.exercise.ex1PowerWithModules(2, 3, 5), pow(2, 3, 5))

	def test_ex1_zero_exponent_returns_one_modulo(self):
		self.assertEqual(self.exercise.ex1PowerWithModules(5, 0, 7), 1 % 7)

	def test_ex1_modulus_one_returns_zero(self):
		self.assertEqual(self.exercise.ex1PowerWithModules(123, 456, 1), 0)

	def test_ex2_mod_array_computes_number_modulo(self):
		self.assertEqual(self.exercise.ex2ModArray([1, 2, 3], 5), 123 % 5)

	def test_ex2_handles_leading_zeros(self):
		self.assertEqual(self.exercise.ex2ModArray([0, 0, 1], 7), 1 % 7)

	def test_ex2_modulus_one_returns_zero(self):
		self.assertEqual(self.exercise.ex2ModArray([9, 9, 9], 1), 0)

	def test_ex3_divisibility_by_3_true_for_empty_or_sum_multiple(self):
		self.assertTrue(self.exercise.ex3DivisibilityBy3([]))
		self.assertTrue(self.exercise.ex3DivisibilityBy3([1, 2, 3]))

	def test_ex3_divisibility_by_3_false_when_not_multiple(self):
		self.assertFalse(self.exercise.ex3DivisibilityBy3([1, 1]))
