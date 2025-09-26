package com.example.dangle;

public abstract class Shape {
    private int x;
    private int y;
    private String color = "violet";
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getLocation(){
        return new int[]{this.x, this.y};
    }

}
