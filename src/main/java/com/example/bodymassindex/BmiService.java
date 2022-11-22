package com.example.bodymassindex;

public class BmiService {
        public double calculate(double m, double h) {

            double bmi = m / (h * h);

       //     System.out.format("%.2f",bmi);

            return bmi;
        }
}
