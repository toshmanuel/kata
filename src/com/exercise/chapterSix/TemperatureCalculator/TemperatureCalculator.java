package com.exercise.chapterSix.TemperatureCalculator;

public class TemperatureCalculator {
    private double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public double celsius() {
        return ((5.0/9.0) * (temperature - 32));
    }

    public double fahrenheit() {
        return ((9.0/5.0) * (temperature + 32));
    }

    public double getEquivalent(byte tempSelector) {
        return switch(tempSelector){
            case 1 -> celsius();
            case 2 -> fahrenheit();
            default -> throw new IllegalStateException("Unexpected value: " + tempSelector);
        };
    }
}
