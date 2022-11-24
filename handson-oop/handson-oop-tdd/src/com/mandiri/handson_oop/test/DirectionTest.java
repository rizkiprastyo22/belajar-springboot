package com.mandiri.handson_oop.test;

import com.mandiri.handson_oop.direction.Direction;
import org.junit.Test;
import static org.junit.Assert.*;

public class DirectionTest {

    Direction north = Direction.NORTH;
    Direction east = Direction.EAST;
    Direction south = Direction.SOUTH;
    Direction west = Direction.WEST;

    @Test
    public void turnRight_should_returnSouth_when_currentDirectionIsEast() {
        //given
        Direction expectedDirection = south;
        Direction currentDirection = east;
        //when
        Direction direction = currentDirection.turnRight();

        assertEquals(expectedDirection, direction);
    }
}
