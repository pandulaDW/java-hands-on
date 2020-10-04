package com.company;

abstract class Shape {
    abstract double perimeter();

    abstract double area();
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double perimeter() {
        return 2 * (length * breadth);
    }

    @Override
    double area() {
        return length * breadth;
    }
}



