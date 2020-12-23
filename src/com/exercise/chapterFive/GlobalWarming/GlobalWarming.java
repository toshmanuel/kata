package com.exercise.chapterFive.GlobalWarming;

import javax.swing.*;

public class GlobalWarming {
    private int questionNumber;
    private String questions;
    private String options;
    int score;

    public void setQuestionNumber(int numberOfQuestions) {
        if (numberOfQuestions > 0 && numberOfQuestions <= 5){
            this.questionNumber = numberOfQuestions;
        }
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestions() {
//        for (int count = 1; count <= questionNumber; count++ ) {
            questions = switch (questionNumber) {
                case 1, 5 -> "Which one of the following cause global warming?";
                case 2 -> "How many percent of carbon dioxide increased in the \natmosphere since pre-industrial times?";
                case 3 -> "Who measures the global warming rate?";
                case 4 -> "Which one of the following result takes place due to global warming?";
                default -> throw new IllegalStateException("Unexpected value: " + questionNumber);
            };
//        }
    }

    public String getQuestions() {
        return questions;
    }

    public void setOptions() {
        setQuestions();
        this.options = switch (getQuestionNumber()) {
                case 1 ->   "1. Carbon dioxide\n" +
                        "2. Oxygen\n" +
                        "3. Nitrogen\n" +
                        "4. Hydrogen";
                case 2 ->   "1. About 10%\n" +
                        "2. About 20%\n" +
                        "3. About 30%\n" +
                        "4. About 40%";
                case 3 ->   "1. Astrologers\n" +
                        "2. Physicist\n" +
                        "3. Philosopher\n" +
                        "4. Climatologist";
                case 4 ->   "1. Maintaining steady temperature\n" +
                        "2. Changes in the rainfall\n" +
                        "3. Pleasant environment\n" +
                        "4. Causing less pollution";
                case 5 ->   "1. Radiative forcing\n" +
                        "2. Earth gravitation force\n" +
                        "3. Oxygen\n" +
                        "4. Centripetal force";
                default -> throw new IllegalStateException("Unexpected value: " + questionNumber);

            };
//        }
    }

    public String getOptions() {
        return options;
    }

    public void setCorrectOption() {
        for (int count = questionNumber; count <= 5; count++) {
            setOptions();
            String answer = JOptionPane.showInputDialog(getQuestionNumber() + "\n" + getQuestions()
                    + "\n" + getOptions() + "\n" +
                    "Enter correct option: ");
            int correctOption = Integer.parseInt(answer);
            if (questionNumber ==1 || questionNumber == 5){
                if (correctOption ==1){
                    score++;
                    System.out.println("correct");
                }else
                    System.out.println("wrong");
            }
            if (questionNumber ==2){
                if (correctOption ==3){
                    System.out.println("correct");
                    score++;
                }else
                    System.out.println("wrong");
            }
            if (questionNumber ==3){
                if (correctOption ==4){
                    System.out.println("correct");
                    score++;
                }else
                    System.out.println("wrong");
            }
            if (questionNumber ==4){
                if (correctOption ==2){
                    System.out.println("correct");
                    score++;
                }else
                    System.out.println("wrong");
            }
//            System.out.println((correctOption == 1 && (questionNumber == 1 || questionNumber == 5)) ? "correct" : "wrong");
//            System.out.println((correctOption == 3 && questionNumber == 2) ? "correct" : "wrong");
//            System.out.println((correctOption == 4 && questionNumber == 3) ? "correct" : "wrong");
//            System.out.println((correctOption == 2 && questionNumber == 4) ? "correct" : "wrong");
            questionNumber++;
        }
    }

    public int getScore() {
        return score;
    }

    public String getComment() {
        return switch (score){
            case 0,1,2,3 -> "Time to brush up on your knowledge of global warming";
            case 4 -> "Very Good";
            case 5 -> "Excellent";
            default -> throw new IllegalStateException("Unexpected value: " + score);
        };
    }
}
