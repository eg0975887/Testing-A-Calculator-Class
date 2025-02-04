import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void addTest() {
        assertEquals(6, calc.add(2, 4));
    }

    @Test
    void subtractTest() {
        assertEquals(2, calc.subtract(4, 2));
    }

    @Test
    void multiplyTest() {
        assertEquals(8, calc.multiply(2, 4));
    }

    @Test
    void divideTest() {
        assertEquals(2, calc.divide(4, 2));
    }
}



