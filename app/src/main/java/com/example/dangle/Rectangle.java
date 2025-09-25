package com.example.dangle;

public class Rectangle extends Shape {
    private int x;
    private int y;
    private int width;
    private int length;

    public Rectangle(int x, int y, int x1, int y1, int length, int width) {
        super(x, y);
        this.x = x1;
        this.y = y1;
        this.length = length;
        this.width = width;
    }
}
