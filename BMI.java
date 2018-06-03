package lecture19_3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;

/**
 *
 * @author David Rilett
 */
public class BMI implements Serializable {

    private double height;
    private double weight;
    private String name;

    public BMI(String new_name, double new_height, double new_weight) {
        // THere is no default constructor

        name = new_name;
        height = new_height;
        weight = new_weight;
    }

    public double getBMI() {
        //input height and weight in inches and lbs
        //return Body mass index
        //make this public
        return weight * 703 / (height * height);
    }

    public String getStatus() {
        //Calculate BMI
        // Outputs status according to BMI
        //make this public
        double bmi = getBMI();
        if (bmi < 18.5) {
            return " underweight";
        } else if (bmi < 25) {
            return " normal";
        } else if (bmi < 30) {
            return " overweight";
        } else {
            return " obese";
        }

    }

    //public double getWeight(){return weight;} // weight accessor
    //public double getHeight(){return height;}  // height getter
    public String getName() {
        return name;
    }  // name get

    @Override
    public String toString() {
        //tells current state of the object
        String bmi = String.format("%.2f", getBMI());
        return "Name " + name + " height " + height + " weight " + weight + "BMI " + bmi + " status " + getStatus();
    }
} 

    
//https://www.rush.edu/health-wellness/quick-guides/what-is-a-healthy-weight
