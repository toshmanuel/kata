package com.exercise.turtle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.HttpURLConnection;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;
    Pen turtlePen;


    @BeforeEach
    void setUp() {

        turtlePen = new Pen();
        turtle = new Turtle(turtlePen);
    }

    @AfterEach
    void tearDown() {
        turtle = null;
        turtlePen = null;
    }

    @Test
    void turtle_hasAPen(){
        assertNotNull(turtle.getPen());
    }

    @Test
    void turtlePen_canBeSetToDown(){
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        assertEquals(turtle.getPen().getPenOrientation(), PenOrientation.PEN_DOWN);
    }

    @Test
    void turtlePen_canBeSetToUp(){
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        assertEquals(turtle.getPen().getPenOrientation(), PenOrientation.PEN_UP);
    }

    @Test
    void turtle_canTurnRight(){
        turtle.setCurrentDirection(CurrentDirection.EAST);
        turtle.turnRight();
        assertEquals(turtle.getCurrentDirection(), CurrentDirection.SOUTH);
        turtle.turnRight();
        assertEquals(turtle.getCurrentDirection(), CurrentDirection.WEST);
        turtle.turnRight();
        assertEquals(turtle.getCurrentDirection(), CurrentDirection.NORTH);
        turtle.turnRight();
        assertEquals(turtle.getCurrentDirection(), CurrentDirection.EAST);
    }

    @Test
    void turtle_canTurnLeft(){
        turtle.setCurrentDirection(CurrentDirection.EAST);
        turtle.turnLeft();
        assertEquals(turtle.getCurrentDirection(), CurrentDirection.NORTH);
        turtle.turnLeft();
        assertEquals(turtle.getCurrentDirection(), CurrentDirection.WEST);
        turtle.turnLeft();
        assertEquals(turtle.getCurrentDirection(), CurrentDirection.SOUTH);
        turtle.turnLeft();
        assertEquals(turtle.getCurrentDirection(), CurrentDirection.EAST);
    }

    @Test
    void turtle_canMoveEastWard_onASketchPad(){
        turtle.setCurrentDirection(CurrentDirection.EAST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        SketchPad sketchPad = new SketchPad();
        turtle.setCurrentPosition(new Position(0, 0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(0, 5), turtle.getCurrentPosition());
    }
}