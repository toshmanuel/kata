package com.exercise.turtle;

public class Position {
    private int columnPosition;
    private int rowPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        boolean isSameClass = obj.getClass() == this.getClass();
        if (isSameClass) {
            Position comparedObject = (Position) obj;
            boolean isSameCoordinate = (comparedObject.getColumnPosition()
                                        ==this.columnPosition && comparedObject.getRowPosition()
                                        ==this.rowPosition);
            if(isSameCoordinate){ 
                isEqual = true;
            }
        }
        return isEqual;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }
}
