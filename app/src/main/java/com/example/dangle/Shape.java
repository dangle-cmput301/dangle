package com.example.dangle;

public abstract class Shape {
    private int x;
    private int y;
<<<<<<< HEAD
=======
    private String color = "purple";
>>>>>>> 413d2bc9411ec434c4e491f0049ed923bb56b0a6
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getLocation(){
        return new int[]{this.x, this.y};
    }

}
