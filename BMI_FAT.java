/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture19_3;

//import BMI;

import java.io.Serializable;


/**
 *
 * @author David Rilett
 */
public class BMI_FAT extends BMI implements Serializable  {
    private int age;
    private int gender;
    public BMI_FAT(String new_name, double new_height, double new_weight, int age, int gender){
    super(new_name, new_height,new_weight);
    this.age = age;
    this.gender = gender;
    }
    public double getPercent(){
    //return (1.39 * getBMI()) + (0.16 * age) - (10.34 * gender) - 9 ;
    return (1.39 * getBMI()) + (0.16 * age) - (10.34 * gender) - 9 ;
    }
    @Override
    
    public String toString(){
    String perc = String.format("%.2f",getPercent());    
    return super.toString()+ " age "+age+" gender "+ gender+"fat percent "+perc +"\n";
    }
    //public int compareTo(BMI_FAT comparebmi) {
      //  String comparename=((BMI_FAT)comparebmi).getName();
        // For Ascending order
        //System.out.println( this.getName().compareToIgnoreCase(comparename)    );
        //return this.getName().compareToIgnoreCase(comparename);

        // For Descending order do like this 
        //return compareage-this.studentage;
    //}
}
