package com.company.InueronMockTest;

public class Que2 {
    public static void main(String[] args) {
        ShapeCalculator object = new ShapeCalculator();

        Shape rectangle = new Rectangle(2,4);
        object.printArea(rectangle);

        Shape circle = new Circle(2);
        object.printArea(circle);

        Shape triangle = new triangle(2,5);
        object.printArea(triangle);

    }
}


abstract class Shape{
    abstract float calculateArea();
}

class Rectangle extends Shape{
    int length ;
    int width;

    public Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }

    @Override
    float calculateArea(){
        return (length * width);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}


class Circle extends Shape {

    int radius ;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    float calculateArea() {
        return (float) (3.141 * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle";
    }
}

class triangle extends Shape {
    int height;
    int breadth;

    public triangle(int height, int breadth) {
        this.height = height;
        this.breadth = breadth;
    }

    @Override
    float calculateArea() {
        return (float) (0.5 * height * breadth);
    }

    @Override
    public String toString() {
        return "triangle";
    }
}

class ShapeCalculator {
    public void printArea(Shape obj){
        System.out.println("Area of " + obj + " is : " + obj.calculateArea());
    }
}
