package com.lab08;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public Button calculateBtn;
    public Button resetAllBtn;

    public TextArea answer;
    public TextArea errorTextArea;

    public TextField dividend;
    public TextField divisor;

    public void solveDivision() {
        try {
            double a = Double.parseDouble(dividend.getText());
            double b = Double.parseDouble(divisor.getText());

            double s = a / b;
            answer.setText(String.valueOf(s));
        } catch (Throwable exception) {
            answer.setText("An error occurred");
            errorTextArea.setText("Error: \n" + exception);
        }
    }

    public void isUnluckyNumber() {
        try {
            if(divisor.getText().equals("13"))
                throw new UnluckyException("Value 13 - UNLUCKY!");
        } catch (UnluckyException exception) {
            System.err.println(exception);
        }
    }

    class UnluckyException extends Exception {
        public UnluckyException(String message) {
            super(message);
            setMessageTextArea(message);
        }
    }

    public void resetAppStateToInitial() {
        dividend.setText("");
        divisor.setText("");
        answer.setText("");
        errorTextArea.setText("");
    }

    public void setMessageTextArea(String text) {
        errorTextArea.setText(text);
    }
}