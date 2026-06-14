using System;
using System.Collections.Generic;
using System.Text;

namespace Intermediate.day52
{
    public class Exercise
    {
        public class ClassComplexNumber
        {
            float real, imaginary;
            ClassComplexNumber(float x, float y)
            {
                this.real = x;
                this.imaginary = y;
            }
            ClassComplexNumber add(ClassComplexNumber x)
            {
                // Complete the function
                return new ClassComplexNumber(this.real + x.real, this.imaginary + x.imaginary);
            }

            ClassComplexNumber subtract(ClassComplexNumber x)
            {
                // Complete the function
                return new ClassComplexNumber(this.real - x.real, this.imaginary - x.imaginary);
            }

            ClassComplexNumber multiply(ClassComplexNumber x)
            {
                // Complete the function
                float r = x.real * this.real - x.imaginary * this.imaginary;
                float i = this.imaginary * x.real + this.real * x.imaginary;
                return new ClassComplexNumber(r, i);
            }

            ClassComplexNumber divide(ClassComplexNumber x)
            {
                // Complete the function
                float r = (this.real * x.real + this.imaginary * x.imaginary) / (x.real * x.real + x.imaginary * x.imaginary);
                float i = (this.imaginary * x.real - this.real * x.imaginary) / (x.real * x.real + x.imaginary * x.imaginary);
                return new ClassComplexNumber(r, i);
            }
        }
        class Circle
        {
            // Define properties here
            float radius;
            float pi = 3.14f;

            // Define constructor here
            public Circle(float radius)
            {
                this.radius = radius;
            }

            float perimeter()
            {
                // Complete the function
                return 2 * pi * this.radius;
            }

            float area()
            {
                // Complete the function
                return pi * this.radius * this.radius;
            }
        }
        class Rectangle
        {
            // Define properties here
            int x, y;

            // Define constructor here
            public Rectangle(int x, int y)
            {
                this.x = x;
                this.y = y;
            }

            int perimeter()
            {
                // Complete the function
                return 2 * (x + y);
            }

            int area()
            {
                // Complete the function
                return x * y;
            }
        }
    }
}
