import math
class Exercise:
    class ClassComplexNumber:
        def __init__(self, real, imaginary):
            self.real = real
            self.imaginary = imaginary

        def __add__(self, other):
            return Exercise.ClassComplexNumber(self.real + other.real, self.imaginary + other.imaginary)

        def __sub__(self, other):
            return Exercise.ClassComplexNumber(self.real - other.real, self.imaginary - other.imaginary)

        def __mul__(self, other):
            real = self.real * other.real - self.imaginary * other.imaginary
            imaginary = self.real * other.real + self.imaginary * other.imaginary
            return Exercise.ClassComplexNumber(real, imaginary)

        def __truediv__(self, other):
            r = (self.real * other.real + self.imaginary * other.imaginary) / (other.real * other.real + other.imaginary * other.imaginary)
            i = (self.imaginary * other.real - self.real * other.imaginary) / (other.real * other.real + other.imaginary * other.imaginary)
            return Exercise.ClassComplexNumber(r, i)

        def __floordiv__(self, other):
            r = (self.real * other.real + self.imaginary * other.imaginary) // (other.real * other.real + other.imaginary * other.imaginary)
            i = (self.imaginary * other.real - self.real * other.imaginary) // (other.real * other.real + other.imaginary * other.imaginary)
            return Exercise.ClassComplexNumber(r, i)

    class Circle:
        def __init__(self, radius):
            self.radius = radius
        def area(self):
            return math.pi * self.radius * self.radius
        def perimeter(self):
            return 2 * math.pi * self.radius

    class Rectangle:
        def __init__(self, length, width):
            self.length = length
            self.width = width
        def area(self):
            return self.length * self.width
        def perimeter(self):
            return 2 * (self.length + self.width)