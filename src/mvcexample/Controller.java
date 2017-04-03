package mvcexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model
public class Controller {

    private final View theView;
    private final Model theModel;

    public Controller(View theView, Model theModel) {
        this.theView = theView;
        this.theModel = theModel;

        // Tell the View that when ever the calculate button
        // is clicked to execute the actionPerformed method
        // in the CalculateListener inner class
        this.theView.addCalculateListener(new CalculateListener());
        this.theView.addCalculateListener1(new CalculateListener1());
        this.theView.addCalculateListener2(new CalculateListener2());
        this.theView.addCalculateListener3(new CalculateListener3());
        this.theView.clearFields(new ClearFields());

    }

    class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            // Surround interactions with the view with
            // a try block in case numbers weren't
            // properly entered
            try {

                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNumbers(firstNumber, secondNumber);

                theView.setCalcSolution(theModel.getCalculationValue());

            } catch (NumberFormatException ex) {

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter 2 Integers to add");
            }
        }
    }
    class CalculateListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber1, secondNumber1 = 0;

            try {

                firstNumber1 = theView.getFirstNumber1();
                secondNumber1 = theView.getSecondNumber1();

                theModel.multTwoNumbers(firstNumber1, secondNumber1);

                theView.setCalcSolution1(theModel.getCalculationValue1());

            } catch (NumberFormatException ex) {

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter 2 Integers to mult");

            }
        }
    }
    class CalculateListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber2, secondNumber2 = 0;

            try {

                firstNumber2 = theView.getFirstNumber2();
                secondNumber2 = theView.getSecondNumber2();

                theModel.subTwoNumbers(firstNumber2, secondNumber2);

                theView.setCalcSolution2(theModel.getCalculationValue2());

            } catch (NumberFormatException ex) {

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter 2 Integers to subtract");

            }
        }
    }
    class CalculateListener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber3, secondNumber3 = 0;

            try {

                firstNumber3 = theView.getFirstNumber3();
                secondNumber3 = theView.getSecondNumber3();

                theModel.powTwoNumbers(firstNumber3, secondNumber3);

                theView.setCalcSolution3(theModel.getCalculationValue3());

            } catch (NumberFormatException ex) {

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter 2 Integers to pow");

            }
        }
    }
    class ClearFields implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            theView.clearArguments();
            theView.clearSolutions();
        }
    }
}
