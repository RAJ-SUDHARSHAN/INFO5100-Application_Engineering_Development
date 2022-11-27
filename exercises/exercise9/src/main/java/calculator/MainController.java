package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label result;
    private double num1 = 0;
    private String operator = "";
    private boolean start = true;
    private double output = 0;
    private Calculate calc = new Calculate();

    @FXML
    public void processNumbers(ActionEvent e) {
        if (start) {
            result.setText("");
            start = false;
        }
        String value = ((Button) e.getSource()).getText();
        result.setText(result.getText() + value);
    }

    @FXML
    public void processOperators(ActionEvent e) {
        if (output == 0) {
            String value = ((Button) e.getSource()).getText();

            if (!value.equals("=")) {
                if (!operator.isEmpty())
                    return;

                operator = value;
                num1 = Double.parseDouble(result.getText());
                result.setText("");
            } else {
                if (operator.isEmpty()) {
                    return;
                }
                Double num2 = Double.parseDouble(result.getText());
                output = calc.Calculate(num1, num2, operator);
                result.setText(String.valueOf(output));
                operator = "";
                start = true;
            }
        } else {
            String value = ((Button) e.getSource()).getText();

            if (!value.equals("=")) {
                if (!operator.isEmpty())
                    return;

                operator = value;
                num1 = Double.parseDouble(result.getText());
                result.setText("");
            } else {
                if (operator.isEmpty()) {
                    return;
                }
                Double num2 = Double.parseDouble(result.getText());
                output = calc.Calculate(output, num2, operator);
                result.setText(String.valueOf(output));
                operator = "";
                start = true;
            }
        }

    }
}
