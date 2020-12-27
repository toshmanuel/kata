package com.exercise.chapterSix.Square;

public class Square {
    private int size;

    public void setInput(int size) {
        if(size > 0){
            this.size = size;
        }
    }

    public int getInput() {
        return size;
    }

    public void printSquare(int sizeOfSquare) {
        for (int rows = sizeOfSquare; rows > 0; rows--){
            for (int column = 0; column < sizeOfSquare; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
