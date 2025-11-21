package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    public void testAdd_fail()
    {
       Exception ex = assertThrows(ArithmeticException.class, ()->calc.add(Integer.MAX_VALUE,1));// max value +1 to create overflow
        assertEquals("Value out of range, above highest value.", ex.getMessage());
    }

    @Test
    public void testSubtract_Success()
    {
        assertEquals(20, calc.subtract(25,5));
    }

    @Test
    public void testSubtract_fail() {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.subtract(Integer.MIN_VALUE,-1));
        assertEquals("Value out of range, below lowest value.", ex.getMessage());
    }

    @Test
    public void testMultiply_Success()
    {
        assertEquals(49, calc.multiply(7,7));
    }

    @Test
    public void testMultiply_fail(){
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.multiply(Integer.MAX_VALUE,1));
        assertEquals("Value too high or too low.", ex.getMessage());
    }


    @Test
    public void testDivide_Success()
    {
        assertEquals(5, calc.divide(25,5));
    }
}
