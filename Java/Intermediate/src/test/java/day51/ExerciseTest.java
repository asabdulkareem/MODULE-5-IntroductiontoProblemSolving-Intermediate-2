package day51;

import org.junit.jupiter.api.Test;

public class ExerciseTest {
    @Test
    public void ex1ImplementPowerFunctionReturnsCorrectValues() {
        assert Exercise.ex1ImplementPowerFunction(2, 3, 1000) == 8;
        assert Exercise.ex1ImplementPowerFunction(3, 4, 1000) == 81;
        assert Exercise.ex1ImplementPowerFunction(5, 0, 1000) == 1;
        assert Exercise.ex1ImplementPowerFunction(7, 2, 1000) == 49;
        assert Exercise.ex1ImplementPowerFunction(10, 5, 1000) == 0; // because 10^5 = 100000 which is divisible by 1000
    }
}
