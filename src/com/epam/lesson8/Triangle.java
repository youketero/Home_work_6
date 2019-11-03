package com.epam.lesson8;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                " a: " + a +
                ", b: " + b +
                ", c: " + c ;
    }

    @Override
    public double calcArea() {
        double p;
        p = (double) (this.a + this.b + this.c)/2;
        return Math.sqrt((p*(p-a)*(p-b)*(p-c)));
    }

    @Override
    public void draw() {
        System.out.println(System.out.printf("%s%s%7.2f%n" , this.toString() , " Area ", this.calcArea() ));
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Shape){
            return (int)(this.calcArea() - ((Shape) o).calcArea());
        }
        return 0;
    }
}
