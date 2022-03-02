package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller {
    @FXML private TextField txtHeight;
    @FXML private TextField txtWeight;
    @FXML private Button btnCalc;
    @FXML private Label lbResult;

    public void bmiHandle(ActionEvent event){
        double height = Double.parseDouble(txtHeight.getText()) / 100;
        double weight = Double.parseDouble(txtWeight.getText());
        double bmi = weight / Math.pow(height, 2);
        String bmiStatus = null;

        if (bmi < 18.5) {
            bmiStatus = "Below normal weight";
            lbResult.setTextFill(Color.GREEN);
        }
        else if (bmi >= 18.5 && bmi < 25) {
            bmiStatus = "Normal weight";
            lbResult.setTextFill(Color.YELLOWGREEN);
        }
        else {
            bmiStatus = "Overweight";
            lbResult.setTextFill(Color.RED);
        }

        lbResult.setText(String.format("%.2f - %s", bmi, bmiStatus));
    }
}
