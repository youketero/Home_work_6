package com.epam.lesson8;

import java.util.Comparator;

public  abstract class  Shape implements Drawable, Comparable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }
    public abstract double calcArea();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " color: " + color;
    }

    public String getColor() {
        return color;
    }
}
