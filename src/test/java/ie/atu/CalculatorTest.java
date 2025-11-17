package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    public void setup()
    {
        calc = new Calculator();
    }

    @Test
    public void testAdd_Success()
    {
        assertEquals(4,calc.add(2,2));
    }

    @Test
    public void testSubtract_Success()
    {
        assertEquals(20, calc.subtract(25,5));
    }

    @Test
    public void testMultiply_Success()
    {
        assertEquals(49, calc.multiply(7,7));
    }

    @Test
    public void testDivide_Success()
    {
        assertEquals(0, calc.divide(5,5));
    }
}
