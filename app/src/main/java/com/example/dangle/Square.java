package com.example.dangle;

public class Square extends Shape{
    private int x;
    private int y;
    private int width;
    private int height;

    public Square(int x, int y, int x1, int y1, int width, int height) {
        super(x, y);
        this.x = x1;
        this.y = y1;
        this.width = width;
        this.height = height;
    }
}
