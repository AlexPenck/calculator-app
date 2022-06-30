package com.calc.src;

import java.math.*;

public class CalculatorModel {
    public double add(double x1, double x2){
        return  x1+x2;
    }
    public double substract(double x1, double x2){
        return  x1-x2;
    }
    public double divide(double x1, double x2){
        return  x1/x2;
    }
    public double multiply(double x1, double x2){
        return  x1*x2;
    }
    public double power(double x1, int n){
        double tempX = 1;
        for (int i = 0; i < n; i++) {
            tempX *= x1;
        }
        return  tempX;
    }
    public double squareRoot(double x1){
        return Math.sqrt(x1);
    }
    public double nRoot(double x1, double x2){
        return Math.pow(x1,1/x2);
    }

//    public static void main(String[] args) {
//        System.out.println(add(5,5));
//        System.out.println(power(2,2));
//        System.out.println(squareRoot(5));
//        System.out.println(nRoot(27,3));
//    }
}
