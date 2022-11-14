package com.bryanguerineau.runner;

public class Camera {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Camera(int x, int y) {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
