package day52;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExerciseTest {

    @Test
    void classComplexNumberAddAddsRealAndImaginaryParts() {
        Exercise ex = new Exercise();
        Exercise.ClassComplexNumber a = ex.new ClassComplexNumber(1.5f, 2.5f);
        Exercise.ClassComplexNumber b = ex.new ClassComplexNumber(2.0f, -1.0f);

        Exercise.ClassComplexNumber res = a.add(b);

        assertEquals(3.5f, res.real, 0.0001f);
        assertEquals(1.5f, res.imaginary, 0.0001f);
    }

    @Test
    void classComplexNumberSubtractSubtractsRealAndImaginaryParts() {
        Exercise ex = new Exercise();
        Exercise.ClassComplexNumber a = ex.new ClassComplexNumber(5.0f, 4.0f);
        Exercise.ClassComplexNumber b = ex.new ClassComplexNumber(2.0f, 1.5f);

        Exercise.ClassComplexNumber res = a.subtract(b);

        assertEquals(3.0f, res.real, 0.0001f);
        assertEquals(2.5f, res.imaginary, 0.0001f);
    }

    @Test
    void classComplexNumberMultiplyProducesCorrectProduct() {
        Exercise ex = new Exercise();
        Exercise.ClassComplexNumber a = ex.new ClassComplexNumber(3.0f, 2.0f);
        Exercise.ClassComplexNumber b = ex.new ClassComplexNumber(1.0f, 4.0f);

        // (3+2i)*(1+4i) = (3*1 - 2*4) + (3*4 + 2*1)i = (3 - 8) + (12 + 2)i = -5 + 14i
        Exercise.ClassComplexNumber res = a.multiply(b);

        assertEquals(-5.0f, res.real, 0.0001f);
        assertEquals(14.0f, res.imaginary, 0.0001f);
    }

    @Test
    void classComplexNumberDivideProducesCorrectQuotient() {
        Exercise ex = new Exercise();
        Exercise.ClassComplexNumber a = ex.new ClassComplexNumber(5.0f, 3.0f);
        Exercise.ClassComplexNumber b = ex.new ClassComplexNumber(2.0f, -1.0f);

        // (5+3i)/(2-1i) = (7/5) + (11/5)i = 1.4 + 2.2i
        Exercise.ClassComplexNumber res = a.divide(b);

        assertEquals(1.4f, res.real, 0.0001f);
        assertEquals(2.2f, res.imaginary, 0.0001f);
    }

    @Test
    void classComplexNumberDivideByZeroProducesNaNComponents() {
        Exercise ex = new Exercise();
        Exercise.ClassComplexNumber a = ex.new ClassComplexNumber(1.0f, 1.0f);
        Exercise.ClassComplexNumber zero = ex.new ClassComplexNumber(0.0f, 0.0f);

        Exercise.ClassComplexNumber res = a.divide(zero);

        assertTrue(Float.isNaN(res.real));
        assertTrue(Float.isNaN(res.imaginary));
    }

    @Test
    void circlePerimeterComputesCorrectlyForPositiveRadius() {
        Exercise ex = new Exercise();
        Exercise.Circle c = ex.new Circle(1.5f);

        // perimeter = 2 * pi * r = 2 * 3.14 * 1.5 = 9.42
        assertEquals(9.42f, c.perimeter(), 0.0001f);
    }

    @Test
    void circleAreaComputesCorrectlyForPositiveRadius() {
        Exercise ex = new Exercise();
        Exercise.Circle c = ex.new Circle(1.5f);

        // area = pi * r^2 = 3.14 * 1.5 * 1.5 = 7.065
        assertEquals(7.065f, c.area(), 0.0001f);
    }

    @Test
    void circleZeroRadiusHasZeroPerimeterAndArea() {
        Exercise ex = new Exercise();
        Exercise.Circle c = ex.new Circle(0.0f);

        assertEquals(0.0f, c.perimeter(), 0.0001f);
        assertEquals(0.0f, c.area(), 0.0001f);
    }

    @Test
    void rectanglePerimeterAndAreaComputeCorrectlyForPositiveSides() {
        Exercise ex = new Exercise();
        Exercise.Rectangle r = ex.new Rectangle(3, 4);

        assertEquals(14, r.perimeter()); // 2*(3+4)
        assertEquals(12, r.area()); // 3*4
    }

    @Test
    void rectangleZeroSideProducesZeroAreaAndCorrectPerimeter() {
        Exercise ex = new Exercise();
        Exercise.Rectangle r = ex.new Rectangle(0, 5);

        assertEquals(10, r.perimeter()); // 2*(0+5)
        assertEquals(0, r.area());
    }
}

