package com.example.bodymassindex;

public class main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        double m = 74;
        double h = 1.78;
        double b = service.calculate(m, h);


        System.out.printf("%.2f%n",b);


    }
}