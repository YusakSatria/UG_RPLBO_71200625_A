package com.rplbo.tocm;

public class Main_71200625 {
    public static void main( String[] args ) {
        double cm = FeetIncToCm(12,5);
        double cm1= FeetIncToCm(30);
        System.out.println("Nilai dalam centimeter: " + cm + " cm");
        System.out.println("Nilai dalam centimeter: " + cm1 + " cm");
    }
    public static double FeetIncToCm(int inch){
        if(inch > 0){
            double a = inch / 12;
            double b = inch % 12;
            System.out.println(inch + " inch = " + a + " feet " +b + " inch");
            return FeetIncToCm(a, b);
        }
        else{
            return -1;
        }
    }
    public static double FeetIncToCm(double feet,double inch) {
        if (feet > 0 && inch > 0 ) {
            feet = feet * 12;
            inch = inch + feet;
            inch = inch * 2.54;
            return inch;
        }
        else {
            return -1;
        }
    }


}