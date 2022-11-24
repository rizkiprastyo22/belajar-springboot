package com.mandiri.handson_oop.shape;

public class Triangle extends Shape{
    private Double floor;
    private Double height;

    public Triangle(Double floor, Double height) {
        this.floor = floor;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "floor=" + floor +
                ", height=" + height +
                '}';
    }

    @Override
    public Double getSurface() {
        return 0.5 * floor * height;
    }
}
