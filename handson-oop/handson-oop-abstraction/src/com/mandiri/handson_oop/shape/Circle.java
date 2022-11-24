package com.mandiri.handson_oop.shape;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public Double getSurface() {
        return Math.PI * Math.pow(radius, 2);
    }
}
