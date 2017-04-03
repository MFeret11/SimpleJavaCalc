package mvcexample;

// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it. 
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class View extends JFrame {

    private final JLabel title = new JLabel("Matt's Calculator");

    //addition
    private final JTextField firstNumber = new JTextField(10);
    private final JLabel additionLabel = new JLabel("+");
    private final JTextField secondNumber = new JTextField(10);
    private final JButton calculateButton = new JButton("Sums to: ");
    private final JTextField calcSolution = new JTextField(10);
    //mult
    private final JTextField firstNumber1 = new JTextField(10);
    private final JLabel multLabel = new JLabel("*");
    private final JTextField secondNumber1 = new JTextField(10);
    private final JButton calculateButton1 = new JButton("Mults to: ");
    private final JTextField calcSolution1 = new JTextField(10);

    //sub
    private final JTextField firstNumber2 = new JTextField(10);
    private final JLabel subLabel = new JLabel("-");
    private final JTextField secondNumber2 = new JTextField(10);
    private final JButton calculateButton2 = new JButton("Subs to: ");
    private final JTextField calcSolution2 = new JTextField(10);

    //sub
    private final JTextField firstNumber3 = new JTextField(10);
    private final JLabel powLabel = new JLabel("^");
    private final JTextField secondNumber3 = new JTextField(10);
    private final JButton calculateButton3 = new JButton("Pows to: ");
    private final JTextField calcSolution3 = new JTextField(10);

    //clear
    private final JButton clearButton = new JButton("Clear");

    View() { //

        // Sets up the view and adds the components
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550, 220);

        //JPanel p =new JPanel();
        //p.setBorder(new EmptyBorder(5, 5, 5, 5));
        //calcPanel.add(p);
        //add
        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcSolution.setEditable(false);
        calcPanel.add(calcSolution);

        //mult
        calcPanel.add(firstNumber1);
        calcPanel.add(multLabel);
        calcPanel.add(secondNumber1);
        calcPanel.add(calculateButton1);
        calcSolution1.setEditable(false);
        calcPanel.add(calcSolution1);

        //sub
        calcPanel.add(firstNumber2);
        calcPanel.add(subLabel);
        calcPanel.add(secondNumber2);
        calcPanel.add(calculateButton2);
        calcSolution2.setEditable(false);
        calcPanel.add(calcSolution2);

        //pow
        calcPanel.add(firstNumber3);
        calcPanel.add(powLabel);
        calcPanel.add(secondNumber3);
        calcPanel.add(calculateButton3);
        calcSolution3.setEditable(false);
        calcPanel.add(calcSolution3);

        //clear
        calcPanel.add(clearButton);

        //Title
        calcPanel.add(title);

        this.add(calcPanel);

        // End of setting up the components --------
    }
//addition

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public int getCalcSolution() {
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }

//mult
    public int getFirstNumber1() {
        return Integer.parseInt(firstNumber1.getText());
    }

    public int getSecondNumber1() {
        return Integer.parseInt(secondNumber1.getText());
    }

    public int getCalcSolution1() {
        return Integer.parseInt(calcSolution1.getText());
    }

    public void setCalcSolution1(int solution) {
        calcSolution1.setText(Integer.toString(solution));
    }

//sub
    public int getFirstNumber2() {
        return Integer.parseInt(firstNumber2.getText());
    }

    public int getSecondNumber2() {
        return Integer.parseInt(secondNumber2.getText());
    }

    public int getCalcSolution2() {
        return Integer.parseInt(calcSolution2.getText());
    }

    public void setCalcSolution2(int solution) {
        calcSolution2.setText(Integer.toString(solution));
    }

    //pow
    public int getFirstNumber3() {
        return Integer.parseInt(firstNumber3.getText());
    }

    public int getSecondNumber3() {
        return Integer.parseInt(secondNumber3.getText());
    }

    public int getCalcSolution3() {
        return Integer.parseInt(calcSolution3.getText());
    }

    public void setCalcSolution3(int solution) {
        calcSolution3.setText(Integer.toString(solution));
    }

    // If the calculateButton is clicked execute a method
    // in the Controller named actionPerformed
    void addCalculateListener(ActionListener listenForCalcButton) {
        calculateButton.addActionListener(listenForCalcButton);
    }

    void addCalculateListener1(ActionListener listenForCalcButton1) {
        calculateButton1.addActionListener(listenForCalcButton1);
    }

    void addCalculateListener2(ActionListener listenForCalcButton2) {
        calculateButton2.addActionListener(listenForCalcButton2);
    }

    void addCalculateListener3(ActionListener listenForCalcButton3) {
        calculateButton3.addActionListener(listenForCalcButton3);
    }

    //Clear button
    void clearFields(ActionListener listenForClearButton) {
        clearButton.addActionListener(listenForClearButton);
    }
    public void clearArguments() {
        firstNumber.setText("");
        secondNumber.setText("");
        firstNumber1.setText("");
        secondNumber1.setText("");
        firstNumber2.setText("");
        secondNumber2.setText("");
        firstNumber3.setText("");
        secondNumber3.setText("");
    }
    public void clearSolutions() {
        calcSolution.setText("");
        calcSolution1.setText("");
        calcSolution2.setText("");
        calcSolution3.setText("");

    }

    // Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage) {

        JOptionPane.showMessageDialog(this, errorMessage);

    }

}
