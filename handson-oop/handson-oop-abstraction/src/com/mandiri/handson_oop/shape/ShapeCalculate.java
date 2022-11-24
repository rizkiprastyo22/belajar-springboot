package com.mandiri.handson_oop.shape;

public class ShapeCalculate {

    public Double totalSurface(Shape[] arrShape) {
        Double total = 0.0;
        for (Shape arr: arrShape) {
            total += arr.getSurface();
        }
        return total;
    }
}
