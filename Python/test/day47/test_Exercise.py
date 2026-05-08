import unittest
from src.day47.Exercise import Exercise
class test_Exercise(unittest.TestCase):
    def setUp(self):
        self.exercise = Exercise()
    def test_ex1_to_lower_converts_all_uppercase_characters_in_list(self):
        chars = list("HeLLo")
        self.assertEqual(self.exercise.ex1ToLower(chars), list("hello"))

    def test_ex2_to_upper_converts_all_lowercase_characters_in_list(self):
        chars = list("woRlD")
        self.assertEqual(self.exercise.ex2ToUpper(chars), list("WORLD"))

    def test_ex3_toggle_case_flips_each_character_case_in_list(self):
        chars = list("AbCxyZ")
        self.assertEqual(self.exercise.ex3ToggleCase(chars), list("aBcXYz"))

    def test_ex4_count_sort_sorts_positive_integers_starting_from_one(self):
        self.assertEqual(self.exercise.ex4CountSort([3, 1, 2]), [1, 2, 3])

    def test_ex4_count_sort_returns_empty_for_empty_input(self):
        self.assertEqual(self.exercise.ex4CountSort([]), [])

    def test_ex4_count_sort_handles_duplicates_correctly(self):
        self.assertEqual(self.exercise.ex4CountSort([2, 3, 2, 1]), [1, 2, 2, 3])

    def test_ex5_simple_reverse_reverses_list_in_place(self):
        arr = [1, 2, 3, 4]
        self.assertEqual(self.exercise.ex5SimpleReverse(arr), [4, 3, 2, 1])

    def test_ex6_simple_reverse_with_indices_reverses_subarray(self):
        arr = [1, 2, 3, 4, 5]
        self.assertEqual(self.exercise.ex6SimpleReverse(arr, 1, 3), [1, 4, 3, 2, 5])

    def test_ex6_reverse_the_string_reverses_words_in_sentence(self):
        chars = list("the sky is blue")
        result = self.exercise.ex6ReverseTheString(chars)
        self.assertEqual(''.join(result), "blue is sky the")

    def test_ex7_longest_palindromic_returns_single_char_for_no_palindrome_longer_than_one(self):
        self.assertEqual(self.exercise.ex7LongestPalindromic("abc"), "a")

    def test_ex7_longest_palindromic_returns_longest_palindrome_for_known_string(self):
        self.assertIn(self.exercise.ex7LongestPalindromic("babad"), {"bab", "aba"})