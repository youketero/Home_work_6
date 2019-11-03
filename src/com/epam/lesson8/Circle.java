package com.epam.lesson8;

import java.util.Comparator;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius:" + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf("%s%s%7.2f%n" , this.toString() , " Area ", this.calcArea() );
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Shape){
            return (int)(this.calcArea() - ((Shape) o).calcArea());
        }
        return 0;
    }

}
