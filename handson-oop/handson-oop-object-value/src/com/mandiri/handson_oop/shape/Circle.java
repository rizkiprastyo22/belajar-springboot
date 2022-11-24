package com.mandiri.handson_oop.shape;

import java.util.Objects;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

//    @Override
//    public String toString() {
//        return "Circle{" +
//                "radius=" + radius +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(radius, circle.radius);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(radius);
//    }

    @Override
    public Double getSurface() {
        return Math.PI * Math.pow(radius, 2);
    }
}
