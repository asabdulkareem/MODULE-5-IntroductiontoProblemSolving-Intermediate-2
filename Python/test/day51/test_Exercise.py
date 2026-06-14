from src.day51.Exercise import Exercise
import unittest
class test_Exercise(unittest.TestCase):
    def setUp(self): self.exercise = Exercise()

    def test_ex1ImplementPowerFunction(self):
        self.assertEqual(self.exercise.ex1ImplementPowerFunction(2, 3, 1000), 8)
        self.assertEqual(self.exercise.ex1ImplementPowerFunction(5, -3, 1000), 125)
        self.assertEqual(self.exercise.ex1ImplementPowerFunction(2, 0, 1000), 1)
        self.assertEqual(self.exercise.ex1ImplementPowerFunction(2, 10, 1000), 24)

    def test_ex2ImplementPowerFunction(self):
        self.assertEqual(self.exercise.ex1ImplementPowerFunction(3, 4, 100), 81)

    def test_ex4JosephusProblem(self):
        self.assertEqual(self.exercise.ex4JosephusProblem(7, 3), 4)
        self.assertEqual(self.exercise.ex4JosephusProblem(5, 2), 3)
        self.assertEqual(self.exercise.ex4JosephusProblem(10, 1), 10)
        self.assertEqual(self.exercise.ex4JosephusProblem(1, 5), 1)
