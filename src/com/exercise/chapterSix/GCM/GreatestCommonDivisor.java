package com.exercise.chapterSix.GCM;

public class GreatestCommonDivisor {
    int greatestDivisor;
    public void checkGreatestDivisor(int input1, int input2) {
        int min = Math.min(input1, input2);
        int max = Math.max(input1, input2);
        int counter;

        if((2 * min) <= max){
            counter = min;
        }else{
            counter = min / 2;
        }
        for(int counterDivisor = 1; counterDivisor <= counter; counterDivisor++){
            if ((input1 % counterDivisor == 0) && (input2 % counterDivisor == 0)){
                greatestDivisor = counterDivisor;
            }
        }
    }

    public int getGreatestDivisor() {
        return greatestDivisor;
    }
}
