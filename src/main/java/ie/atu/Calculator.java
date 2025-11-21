package ie.atu;

public class Calculator {

    public int add(int firstNum, int secondNum)
    {
        if(firstNum == Integer.MAX_VALUE || secondNum == Integer.MAX_VALUE)
        {
            throw new ArithmeticException("Value out of range, above highest value.");
        }
        return firstNum + secondNum;
    }
    public int subtract(int firstNum , int secondNum)
    {
        if(firstNum == Integer.MIN_VALUE || secondNum == Integer.MIN_VALUE) {
            throw new ArithmeticException("Value out of range, below lowest value.");
        }
    return firstNum - secondNum;
    }

    public int multiply(int firstNum, int secondNum)
    {
        if(firstNum * secondNum == Integer.MAX_VALUE || secondNum * firstNum == Integer.MIN_VALUE){
            throw new ArithmeticException("Value too high or too low.");
        }
            return firstNum * secondNum;
    }

    public int divide(int firstNum, int secondNum) {
        if(firstNum == 0 || secondNum == 0){
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return firstNum / secondNum;
    }
}
