package com.mandiri.handson_oop;

import com.mandiri.handson_oop.model.Direction;
import com.mandiri.handson_oop.model.Position;
import com.mandiri.handson_oop.model.Robot;

public class Main {
    public static void main(String[] args) {
        Position initialPosition = new Position(2, 3);
        Direction direction = Direction.EAST;
        Robot robot = new Robot(initialPosition, direction);

        System.out.println(robot);
        robot.moves("AARAAAA");
    }
}
