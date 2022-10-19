package ie.atu.week5;

public class Calculator {
    private int firstNum , secondNum;
    private int result;


    public int add(int firstNum, int secondNum) {
        result = firstNum + secondNum;
        return result;
    }

    public int subtract(int firstNum, int secondNum) {
        result = firstNum - secondNum;
        return result;
    }

    public int multiply(int firstNum, int secondNum) {
        result = firstNum * secondNum;
        return result;
    }



}
