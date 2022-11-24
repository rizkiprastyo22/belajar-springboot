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
        Command cmd = Command.valueOf(command);
        switch (cmd) {
            case A:forward();
            break;
            case R:direction = direction.turnRight();
            break;
            case L:direction = direction.turnLeft();
            break;
            default:
                System.out.println("Command not found");
        }

//        if (command.equals("A")) {
//            forward();
//        }
//
//        if (command.equals("R")) {
//            direction = direction.turnRight();
//        }
//
//        if (command.equals("L")) {
//            direction = direction.turnLeft();
//            }
//        }
    }

    private void forward() {
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

    @Override
    public String toString() {
        return "Robot{" +
                "position=" + position +
                ", direction=" + direction +
                '}';
    }
}
