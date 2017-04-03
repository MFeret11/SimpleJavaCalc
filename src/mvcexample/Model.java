package mvcexample;
// The Model performs all the calculations needed
// and that is it. It doesn't know the View 
// exists

public class Model {

    // Holds the value of the sum of the numbers
    // entered in the view
    private int calculationValue;
    private int calculationValue1;
    private int calculationValue2;
    private int calculationValue3;

    //addition
    public void addTwoNumbers(int firstNumber, int secondNumber) {

        calculationValue = firstNumber + secondNumber;

    }
    public int getCalculationValue() {

        return calculationValue;

    }
    //multiplication
    public void multTwoNumbers(int firstNumber, int secondNumber) {

        calculationValue1 = firstNumber * secondNumber;

    }
    public int getCalculationValue1() {

        return calculationValue1;

    }
    //sub
    public void subTwoNumbers(int firstNumber, int secondNumber) {

        calculationValue2 = firstNumber - secondNumber;

    }
    public int getCalculationValue2() {

        return calculationValue2;

    }
    //pow
     public void powTwoNumbers(int firstNumber, int secondNumber) {

        calculationValue3 = (int) Math.pow(firstNumber, secondNumber);

    }
    public int getCalculationValue3() {

        return calculationValue3;
    }
}
