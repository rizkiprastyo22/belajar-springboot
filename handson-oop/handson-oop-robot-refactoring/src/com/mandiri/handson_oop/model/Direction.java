package com.mandiri.handson_oop.model;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction turnRight() {
        int irdinil = (this.ordinal() + 1) % Direction.values().length;
        return Direction.values()[irdinil];

//        if (this.ordinal() == Direction.values().length - 1) {
//            return Direction.values()[0];
//        } else {
//            return Direction.values()[this.ordinal() + 1];
//        }
    }

    public Direction turnLeft() {
        int irdinil = (this.ordinal() + 3) % Direction.values().length;
        return Direction.values()[irdinil];

//        if (this.ordinal() == 0) {
//            return Direction.values()[3];
//        } else {
//            return Direction.values()[this.ordinal() - 1];
//        }
    }
}
