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

}
