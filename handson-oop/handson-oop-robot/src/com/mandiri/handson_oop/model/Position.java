package com.mandiri.handson_oop.model;

public class Position {
    private Integer coordinateX;
    private Integer coordinateY;

    public Position(Integer coordinateX, Integer coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Position getRight() {
        return new Position(coordinateX + 1, coordinateY);
    }

    public Position getLeft() {
        return new Position(coordinateX - 1, coordinateY);
    }

    public  Position getTop() {
        return new Position(coordinateX, coordinateY + 1);
    }

    public  Position getBottom() {
        return new Position(coordinateX, coordinateY -1);
    }

    @Override
    public String toString() {
        return "Position{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
