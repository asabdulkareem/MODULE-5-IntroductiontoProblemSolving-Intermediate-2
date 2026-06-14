import unittest
import math
from src.day52.Exercise import Exercise


class ExerciseBehaviorTests(unittest.TestCase):
    def setUp(self):
        self.exercise = Exercise()

    def test_complex_number_addition_with_positive_values(self):
        c1 = Exercise.ClassComplexNumber(3, 4)
        c2 = Exercise.ClassComplexNumber(1, 2)
        result = c1 + c2
        self.assertEqual(result.real, 4)
        self.assertEqual(result.imaginary, 6)

    def test_complex_number_addition_with_zero(self):
        c1 = Exercise.ClassComplexNumber(5, 7)
        c2 = Exercise.ClassComplexNumber(0, 0)
        result = c1 + c2
        self.assertEqual(result.real, 5)
        self.assertEqual(result.imaginary, 7)

    def test_complex_number_addition_with_negative_values(self):
        c1 = Exercise.ClassComplexNumber(-3, -4)
        c2 = Exercise.ClassComplexNumber(1, 2)
        result = c1 + c2
        self.assertEqual(result.real, -2)
        self.assertEqual(result.imaginary, -2)

    def test_complex_number_subtraction_with_positive_values(self):
        c1 = Exercise.ClassComplexNumber(5, 8)
        c2 = Exercise.ClassComplexNumber(2, 3)
        result = c1 - c2
        self.assertEqual(result.real, 3)
        self.assertEqual(result.imaginary, 5)

    def test_complex_number_subtraction_with_zero(self):
        c1 = Exercise.ClassComplexNumber(5, 7)
        c2 = Exercise.ClassComplexNumber(0, 0)
        result = c1 - c2
        self.assertEqual(result.real, 5)
        self.assertEqual(result.imaginary, 7)

    def test_complex_number_subtraction_with_negative_result(self):
        c1 = Exercise.ClassComplexNumber(2, 3)
        c2 = Exercise.ClassComplexNumber(5, 8)
        result = c1 - c2
        self.assertEqual(result.real, -3)
        self.assertEqual(result.imaginary, -5)

    def test_complex_number_multiplication_with_positive_values(self):
        c1 = Exercise.ClassComplexNumber(2, 3)
        c2 = Exercise.ClassComplexNumber(4, 5)
        result = c1 * c2
        self.assertEqual(result.real, -7)
        self.assertEqual(result.imaginary, 14)

    def test_complex_number_multiplication_with_zero(self):
        c1 = Exercise.ClassComplexNumber(5, 7)
        c2 = Exercise.ClassComplexNumber(0, 0)
        result = c1 * c2
        self.assertEqual(result.real, 0)
        self.assertEqual(result.imaginary, 0)

    def test_complex_number_multiplication_by_one(self):
        c1 = Exercise.ClassComplexNumber(3, 4)
        c2 = Exercise.ClassComplexNumber(1, 0)
        result = c1 * c2
        self.assertEqual(result.real, 3)
        self.assertEqual(result.imaginary, 3)

    def test_complex_number_division_with_positive_values(self):
        c1 = Exercise.ClassComplexNumber(10, 10)
        c2 = Exercise.ClassComplexNumber(2, 2)
        result = c1 / c2
        self.assertEqual(result.real, 5)
        self.assertEqual(result.imaginary, 0)

    def test_complex_number_division_with_different_values(self):
        c1 = Exercise.ClassComplexNumber(20, 10)
        c2 = Exercise.ClassComplexNumber(5, 2)
        result = c1.__truediv__(c2)
        self.assertAlmostEqual(result.real, 4.137931034482759, 2)
        self.assertAlmostEqual(result.imaginary, 0.34, 2)

    def test_complex_number_floordivision_with_positive_values(self):
        c1 = Exercise.ClassComplexNumber(10, 10)
        c2 = Exercise.ClassComplexNumber(3, 3)
        result = c1 // c2
        self.assertEqual(result.real, 3)
        self.assertEqual(result.imaginary, 0)

    def test_complex_number_floordivision_with_different_values(self):
        c1 = Exercise.ClassComplexNumber(20, 15)
        c2 = Exercise.ClassComplexNumber(3, 2)
        result = c1 // c2
        self.assertEqual(result.real, 6)
        self.assertEqual(result.imaginary, 0)

    def test_circle_area_with_positive_radius(self):
        circle = Exercise.Circle(5)
        expected_area = math.pi * 5 * 5
        self.assertEqual(circle.area(), expected_area)

    def test_circle_area_with_unit_radius(self):
        circle = Exercise.Circle(1)
        expected_area = math.pi
        self.assertEqual(circle.area(), expected_area)

    def test_circle_area_with_zero_radius(self):
        circle = Exercise.Circle(0)
        self.assertEqual(circle.area(), 0)

    def test_circle_area_with_fractional_radius(self):
        circle = Exercise.Circle(2.5)
        expected_area = math.pi * 2.5 * 2.5
        self.assertAlmostEqual(circle.area(), expected_area, places=10)

    def test_circle_perimeter_with_positive_radius(self):
        circle = Exercise.Circle(5)
        expected_perimeter = 2 * math.pi * 5
        self.assertEqual(circle.perimeter(), expected_perimeter)

    def test_circle_perimeter_with_unit_radius(self):
        circle = Exercise.Circle(1)
        expected_perimeter = 2 * math.pi
        self.assertEqual(circle.perimeter(), expected_perimeter)

    def test_circle_perimeter_with_zero_radius(self):
        circle = Exercise.Circle(0)
        self.assertEqual(circle.perimeter(), 0)

    def test_circle_perimeter_with_fractional_radius(self):
        circle = Exercise.Circle(1.5)
        expected_perimeter = 2 * math.pi * 1.5
        self.assertAlmostEqual(circle.perimeter(), expected_perimeter, places=10)

    def test_rectangle_area_with_positive_dimensions(self):
        rect = Exercise.Rectangle(4, 5)
        self.assertEqual(rect.area(), 20)

    def test_rectangle_area_with_unit_dimensions(self):
        rect = Exercise.Rectangle(1, 1)
        self.assertEqual(rect.area(), 1)

    def test_rectangle_area_with_zero_length(self):
        rect = Exercise.Rectangle(0, 5)
        self.assertEqual(rect.area(), 0)

    def test_rectangle_area_with_zero_width(self):
        rect = Exercise.Rectangle(5, 0)
        self.assertEqual(rect.area(), 0)

    def test_rectangle_area_with_fractional_dimensions(self):
        rect = Exercise.Rectangle(2.5, 4.5)
        expected_area = 2.5 * 4.5
        self.assertAlmostEqual(rect.area(), expected_area, places=10)

    def test_rectangle_area_with_unequal_dimensions(self):
        rect = Exercise.Rectangle(3, 7)
        self.assertEqual(rect.area(), 21)

    def test_rectangle_perimeter_with_positive_dimensions(self):
        rect = Exercise.Rectangle(4, 5)
        self.assertEqual(rect.perimeter(), 18)

    def test_rectangle_perimeter_with_unit_dimensions(self):
        rect = Exercise.Rectangle(1, 1)
        self.assertEqual(rect.perimeter(), 4)

    def test_rectangle_perimeter_with_zero_length(self):
        rect = Exercise.Rectangle(0, 5)
        self.assertEqual(rect.perimeter(), 10)

    def test_rectangle_perimeter_with_zero_width(self):
        rect = Exercise.Rectangle(5, 0)
        self.assertEqual(rect.perimeter(), 10)

    def test_rectangle_perimeter_with_fractional_dimensions(self):
        rect = Exercise.Rectangle(2.5, 3.5)
        expected_perimeter = 2 * (2.5 + 3.5)
        self.assertAlmostEqual(rect.perimeter(), expected_perimeter, places=10)

    def test_rectangle_perimeter_with_unequal_dimensions(self):
        rect = Exercise.Rectangle(3, 7)
        self.assertEqual(rect.perimeter(), 20)

    def test_complex_number_addition_is_commutative(self):
        c1 = Exercise.ClassComplexNumber(2, 3)
        c2 = Exercise.ClassComplexNumber(4, 5)
        result1 = c1 + c2
        result2 = c2 + c1
        self.assertEqual(result1.real, result2.real)
        self.assertEqual(result1.imaginary, result2.imaginary)

    def test_complex_number_subtraction_is_not_commutative(self):
        c1 = Exercise.ClassComplexNumber(5, 8)
        c2 = Exercise.ClassComplexNumber(2, 3)
        result1 = c1 - c2
        result2 = c2 - c1
        self.assertEqual(result1.real, -result2.real)
        self.assertEqual(result1.imaginary, -result2.imaginary)

    def test_circle_area_scales_quadratically(self):
        circle1 = Exercise.Circle(2)
        circle2 = Exercise.Circle(4)
        area1 = circle1.area()
        area2 = circle2.area()
        self.assertAlmostEqual(area2 / area1, 4, places=10)

    def test_circle_perimeter_scales_linearly(self):
        circle1 = Exercise.Circle(2)
        circle2 = Exercise.Circle(4)
        perimeter1 = circle1.perimeter()
        perimeter2 = circle2.perimeter()
        self.assertAlmostEqual(perimeter2 / perimeter1, 2, places=10)

    def test_rectangle_area_with_large_dimensions(self):
        rect = Exercise.Rectangle(1000, 2000)
        self.assertEqual(rect.area(), 2000000)

    def test_rectangle_perimeter_with_large_dimensions(self):
        rect = Exercise.Rectangle(1000, 2000)
        self.assertEqual(rect.perimeter(), 6000)

