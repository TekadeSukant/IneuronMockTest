package com.company.InueronMockTest;

public class Que4 {
    public static void main(String[] args) {
        Drawable object1 = new DrawRectangle();
        object1.draw();

        System.out.println(" ");

        Drawable object2 = new DrawCircle();
        object2.draw();

    }
}

interface Drawable {
    void draw();

}

class DrawRectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Imagine Rectangle ka chitra... ");
    }
}

class DrawCircle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Imagine Circle ka chitra... ");
    }
}

