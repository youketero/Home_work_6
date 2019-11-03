package com.epam.lesson8;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                " width: " + width +
                " height: " + height;
    }

    @Override
    public double calcArea() {
        return this.width*this.height;
    }

    @Override
    public void draw() {
        System.out.printf("%s%s%7.2f%n" , this.toString() ," Area ", this.calcArea() );
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Shape){
            return (int)(this.calcArea() - ((Shape) o).calcArea());
        }
        return 0;
    }
}
