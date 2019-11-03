package com.epam.lesson8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape[] shapes = {new Circle("red ",23),new Circle(" blue ",26),new Circle("pink",23),
                          new Triangle("red ",3,4,5), new Triangle(" black ", 5,7,9),
                          new Rectangle("white ",2,4),  new Rectangle(" yellow ",12,10),
                          new Rectangle("pink ",20,14), new Rectangle(" black ",21,15)
        };

        for (Shape an: shapes) {
            an.draw();
        }
        System.out.println("_____________________________________");
        double[] sumAll = Sum(shapes);
        printAll(sumAll);
    }
    public static double[] Sum(Shape[] args){
        double sumCircle = 0;
        double sumTriangle = 0;
        double sumRectangle = 0;
        double sumAll = 0;
        for (Shape an : args) {
            if (an instanceof Triangle) {
                an.calcArea();
                sumCircle = sumCircle + an.calcArea();
            }
            if (an instanceof Circle) {
                an.calcArea();
                sumTriangle = sumTriangle + an.calcArea();
            }
            if (an instanceof Rectangle) {
                an.calcArea();
                sumRectangle = sumRectangle + an.calcArea();
            }
            sumAll = sumAll + an.calcArea();
        }
        double[] sum ={sumAll,sumCircle,sumRectangle,sumTriangle};

        return sum;
    }

    public static void printAll(double[] arg){
        int count = 0;
        for (double i: arg) {
            String[] Shapes = {"ALL figures","Circle","Triangle","Rectangle"};
            System.out.println("area of : " + Shapes[count] + " is " + i);
            count++;
        }
    }

}
