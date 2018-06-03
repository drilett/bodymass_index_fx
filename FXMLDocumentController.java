/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture19_3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TextField;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextArea;
/**
 *
 * @author David Rilett
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField height;
    @FXML
    private TextField weight;
    @FXML
    private TextField age;
    @FXML
    private TextField name;
    @FXML
    private TextField gender;
    @FXML
    private PieChart pie1;
    @FXML
    private BarChart bar1;
    @FXML
    private TextArea output;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        pie1.getData().clear();
        bar1.getData().clear(); // clear the charts to avoid duplication
        String n = name.getText(); // simple assignment all String
        Double h = Double.parseDouble(height.getText());
        Double w = Double.parseDouble(weight.getText()); // parse String to Double
        Integer a = Integer.parseInt(age.getText());  // use Integer wrapper classes for parsing ability
        Integer g = Integer.parseInt(gender.getText()); // all strings
        BMI_FAT bmi = new BMI_FAT(n, h, w, a, g); //constructor call
        PieChart.Data d = new PieChart.Data("Fat %", bmi.getPercent());
        PieChart.Data c = new PieChart.Data(bmi.getStatus(), 100 - bmi.getPercent());
        pie1.getData().add(d);
        pie1.getData().add(c); // set up and initialize pie
        XYChart.Series series1 = new XYChart.Series<>();
       series1.getData().add(new XYChart.Data( "BMI", bmi.getBMI()));
       //creating data to be added to BC in correct format ( Data object)
        bar1.getData().addAll(series1); //setup and initialize bar
        output.setText(bmi.toString()); // fill test area
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
