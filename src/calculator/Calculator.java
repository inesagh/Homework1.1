package calculator;

public class Calculator {
    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void addNumbers(){
        System.out.println("Sum of numbers equals " + (num1 + num2));
    }
    public void subtractNumbers(){
        System.out.println("Subtraction of numbers equals " + (num1 - num2));
    }
    public void multiplyNumbers(){
        System.out.println("Multiplication of numbers equals " + (num1 * num2));
    }
    public void divideNumbers(){
        if(num2 != 0) System.out.println("Division of numbers equals " + (num1 / num2));
        else System.out.println("Denominator cannot be 0");
    }
}
