import unittest

from src.day44.Exercise import Exercise


class ExerciseBehaviorTests(unittest.TestCase):
    def setUp(self):
        self.exercise = Exercise()

    def test_checks_bit_returns_1_when_target_bit_is_set(self):
        self.assertEqual(self.exercise.ex1CheckBit(10, 1), 1)

    def test_checks_bit_returns_0_when_target_bit_is_not_set(self):
        self.assertEqual(self.exercise.ex1CheckBit(10, 0), 0)

    def test_checks_bit_handles_zero_value(self):
        self.assertEqual(self.exercise.ex1CheckBit(0, 3), 0)

    def test_counts_number_of_ones_for_positive_integer(self):
        self.assertEqual(self.exercise.ex2NumberOf1Bits(13), 3)

    def test_counts_number_of_ones_returns_zero_for_zero(self):
        self.assertEqual(self.exercise.ex2NumberOf1Bits(0), 0)

    def test_counts_number_of_ones_returns_zero_for_negative_integer(self):
        self.assertEqual(self.exercise.ex2NumberOf1Bits(-7), 0)

    def test_sets_two_distinct_bits(self):
        self.assertEqual(self.exercise.ex3SetBit(1, 3), 10)

    def test_sets_same_bit_position_once_when_positions_match(self):
        self.assertEqual(self.exercise.ex3SetBit(2, 2), 4)

    def test_unsets_bit_when_target_bit_is_set(self):
        self.assertEqual(self.exercise.ex4UnSetBit(10, 1), 8)

    def test_unsets_bit_keeps_value_when_target_bit_is_not_set(self):
        self.assertEqual(self.exercise.ex4UnSetBit(10, 0), 10)

    def test_unsets_bit_keeps_zero_unchanged(self):
        self.assertEqual(self.exercise.ex4UnSetBit(0, 4), 0)



