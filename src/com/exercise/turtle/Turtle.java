package com.exercise.turtle;


public class Turtle {

    private Pen pen;
    private CurrentDirection currentDirection;
    private Position currentPosition;

    public Pen getPen() {
        return pen;
    }
    
    public Turtle(Pen pen){
        this.pen = pen;
        currentDirection = CurrentDirection.EAST;
    }

    public void setCurrentDirection(CurrentDirection direction){
        this.currentDirection = direction;

    }

    public void turnRight() {
        switch(currentDirection){
            case EAST -> setCurrentDirection(CurrentDirection.SOUTH);
            case SOUTH -> setCurrentDirection(CurrentDirection.WEST);
            case WEST -> setCurrentDirection(CurrentDirection.NORTH);
            case NORTH -> setCurrentDirection(CurrentDirection.EAST);

        }
    }

    public CurrentDirection getCurrentDirection() {
        return currentDirection;
    }

    public void turnLeft() {
        switch(currentDirection){
            case EAST -> setCurrentDirection(CurrentDirection.NORTH);
            case NORTH -> setCurrentDirection(CurrentDirection.WEST);
            case WEST -> setCurrentDirection(CurrentDirection.SOUTH);
            case SOUTH -> setCurrentDirection(CurrentDirection.EAST);

        }
    }

    public void move(SketchPad sketchPad, int numberOfSteps) {
        numberOfSteps -= 1;
        Position currentPosition = getCurrentPosition();
        int currentRow = getCurrentPosition().getRowPosition();
        int currentColumn = getCurrentPosition().getColumnPosition();
        switch(currentDirection){
            case EAST ->
                currentPosition.setColumnPosition((currentColumn+numberOfSteps));
            case SOUTH ->
                    currentPosition.setRowPosition((currentRow+numberOfSteps));
            case NORTH ->
                    currentPosition.setRowPosition((currentRow-numberOfSteps));
            case WEST ->
                    currentPosition.setColumnPosition((currentColumn-numberOfSteps));
        }
    }

    public void setCurrentPosition(Position position) {
        currentPosition = position;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}
