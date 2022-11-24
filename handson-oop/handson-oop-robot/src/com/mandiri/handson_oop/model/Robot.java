package com.mandiri.handson_oop.model;

public class Robot {
    private Position position;
    private Direction direction;

    public Robot(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public void moves(String commands) {
        String[] commandsArr = commands.split("");

        for (String comm : commandsArr) {
            move(comm);
            System.out.println(this);
        }
    }

    private void move(String command) {
        if (command.equals("A")) {
            if (direction == Direction.EAST){
                position = position.getRight();
            }
            if (direction == Direction.NORTH){
                position = position.getTop();
            }
            if (direction == Direction.SOUTH){
                position = position.getBottom();
            }
            if (direction == Direction.WEST){
                position = position.getLeft();
            }
        }

        if (command.equals("R")) {
            switch (direction) {
                case EAST: direction = Direction.SOUTH;
                    break;
                case NORTH: direction = Direction.EAST;
                    break;
                case SOUTH: direction = Direction.WEST;
                    break;
                case WEST: direction = Direction.NORTH;
                    break;
            }
        }

        if (command.equals("L")) {
            switch (direction) {
                case EAST: direction = Direction.NORTH;
                    break;
                case NORTH: direction = Direction.WEST;
                    break;
                case SOUTH: direction = Direction.EAST;
                    break;
                case WEST: direction = Direction.SOUTH;
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "position=" + position +
                ", direction=" + direction +
                '}';
    }
}
