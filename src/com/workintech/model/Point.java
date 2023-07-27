package com.workintech.model;

public class Point {
    private int x;
    private int y;

    public Point(int x,int y) {
        this.setX(x);
        this.setY(y);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(Point p) {
        if(p != null){
            int xDiff = p.getX() - x;
            int yDiff = p.getY() - y;
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        }
        return (distance());
    }
    public double distance(int a, int b) {
        int xDiff = a - x;
        int yDiff = b - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
