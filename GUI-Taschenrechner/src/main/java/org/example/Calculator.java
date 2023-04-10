package org.example;

import java.awt.*;
import java.awt.event.*;


public class Calculator extends Frame implements ActionListener {
    private Button plus = new Button();
    private Button minus = new Button();
    private Button multiply = new Button();
    private Button divide = new Button();
    private Button equals = new Button();
    private Button clear = new Button();
    private TextField inputOutput = new TextField();
    private double firstNumber = 0.0;
    private double secondNumber = 0.0;
    private String operation = "";

    public Calculator() {
        this.setVisible(true);
        this.setSize(400, 400);
        this.setLocation(400, 300);
        this.setLayout(null);
        PlusButton();
        MinusButton();
        MultiplyButton();
        EqualsButton();
        ClearButton();
        DivideButton();
        ResultInputOutput();

    }

    private void PlusButton() {
        plus.setLabel("+");
        plus.setBounds(200, 200, 100, 30);
        plus.addActionListener(this);
        add(plus);
    }

    private void MinusButton() {
        minus.setLabel("-");
        minus.setBounds(200, 250, 100, 30);
        minus.addActionListener(this);
        add(minus);
    }

    private void MultiplyButton() {
        multiply.setLabel("x");
        multiply.setBounds(100, 200, 100, 30);
        multiply.addActionListener(this);
        add(multiply);
    }

    private void DivideButton() {
        divide.setLabel("/");
        divide.setBounds(100, 250, 100, 30);
        divide.addActionListener(this);
        add(divide);
    }
    private void EqualsButton() {
        equals.setLabel("=");
        equals.setBounds(200, 300, 50, 30);
        equals.addActionListener(this);
        add(equals);
    }

    private void ClearButton() {
        clear.setLabel("C");
        clear.setBounds(100, 300, 50, 30);
        clear.addActionListener(this);
        add(clear);
    }
    private void ResultInputOutput(){
        inputOutput.setBounds(100, 100, 200, 30);
        add(inputOutput);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == plus) {
            firstNumber = Double.parseDouble(inputOutput.getText());
            inputOutput.setText("");
            operation = "+";
        } else if (e.getSource() == minus) {
            firstNumber = Double.parseDouble(inputOutput.getText());
            inputOutput.setText("");
            operation = "-";
        } else if (e.getSource() == multiply) {
            firstNumber = Double.parseDouble(inputOutput.getText());
            inputOutput.setText("");
            operation = "*";
        } else if (e.getSource() == divide) {
            firstNumber = Double.parseDouble(inputOutput.getText());
            inputOutput.setText("");
            operation = "/";
        } else if (e.getSource() == equals) {
            secondNumber = Double.parseDouble(inputOutput.getText());
            double result = 0.0;
            switch (operation) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
            }
            inputOutput.setText(Double.toString(result));
        } else if (e.getSource() == clear) {
            inputOutput.setText("");
            firstNumber = 0.0;
            secondNumber = 0.0;
            operation = "";
        } else {System.err.println("Unexpected event: " + e.getSource());
        }
    }
}

