package com.exercise.turtle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;
    Pen turtlePen;
    SketchPad sketchPad;


    @BeforeEach
    void setUp() {

        turtlePen = new Pen();
        turtle = new Turtle(turtlePen);
        sketchPad = new SketchPad(20, 20);
    }

    @AfterEach
    void tearDown() {
        turtle = null;
        turtlePen = null;
        sketchPad = null;
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
        turtle.setCurrentPosition(new Position(0, 0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position(0, 5), turtle.getCurrentPosition());
    }

    @Test
    void turtle_canMoveSouthWard_onASketchPad(){
        turtle.setCurrentDirection(CurrentDirection.SOUTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        turtle.setCurrentPosition(new Position(0, 0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(4, 0), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position(5, 0), turtle.getCurrentPosition());
    }

    @Test
    void turtle_canMoveNorthWard_onASketchPad(){
        turtle.setCurrentDirection(CurrentDirection.NORTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        turtle.setCurrentPosition(new Position(7, 0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(3, 0), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position(2, 0), turtle.getCurrentPosition());
    }

    @Test
    void turtle_canMoveWestWard_onASketchPad(){
        turtle.setCurrentDirection(CurrentDirection.WEST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        turtle.setCurrentPosition(new Position(0, 7));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(0, 3), turtle.getCurrentPosition());

        turtle.move(sketchPad, 2);
        assertEquals(new Position(0, 2), turtle.getCurrentPosition());
    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingEast(){
        turtle.setCurrentDirection(CurrentDirection.EAST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        turtle.setCurrentPosition(new Position(0, 0));
        turtle.move(sketchPad, 5);
        for (int i = 0; i < 5; i++){
            assertEquals(1, sketchPad.getFloor()[0][i]);
            System.out.println(sketchPad.getFloor()[0][i]);
        }
    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingSouth(){
        turtle.setCurrentDirection(CurrentDirection.SOUTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        turtle.setCurrentPosition(new Position(0, 0));
        turtle.move(sketchPad, 5);
        for (int i = 0; i < 5; i++){
            assertEquals(1, sketchPad.getFloor()[i][0]);
            System.out.println(sketchPad.getFloor()[i][0]);
        }
    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingWest(){
        turtle.setCurrentDirection(CurrentDirection.WEST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        turtle.setCurrentPosition(new Position(0, 5));
        turtle.move(sketchPad, 5);
        for (int i = 5; i > 0; i--){
            assertEquals(1, sketchPad.getFloor()[0][i]);
            System.out.println(sketchPad.getFloor()[0][i]);
        }
    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingNorth(){
        turtle.setCurrentDirection(CurrentDirection.NORTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        turtle.setCurrentPosition(new Position(5, 0));
        turtle.move(sketchPad, 5);
        for (int i = 5; i > 0; i--){
            assertEquals(1, sketchPad.getFloor()[i][0]);
            System.out.println(sketchPad.getFloor()[i][0]);
        }
    }
}