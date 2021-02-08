package Polymorphic_Class.ConstructorOverloadingExample;

import java.util.Arrays;

public class ConstructorOverloading {
    private int hour;
    private int minutes;
    private int seconds;

    public ConstructorOverloading() {
        this(0, 0, 0);
    }

    public ConstructorOverloading(int hour) {
        this(hour, 0, 0);
    }

    public ConstructorOverloading(int hour, int minutes) {
        this(hour, minutes, 0);
    }

    public ConstructorOverloading(ConstructorOverloading times) {
        this(times.getHour(), times.getMinute(), times.getSeconds());
    }

    public ConstructorOverloading(int hour, int minutes, int seconds) {
        validateTime(hour, minutes, seconds);
    }

    public void setTime(int hours, int minutes, int seconds){
        validateTime(hours, minutes, seconds);
    }

    public void setHour(int hour){
        boolean isHourValid = hour < 0 || hour >=24;

        if (isHourValid)
            throw new IllegalArgumentException("hours should be between 0 and 23");
        this.hour = hour;
    }

    public int getHour (){
        return hour;
    }

    public void setMinutes(int minutes){
        boolean isMinutesValid = minutes < 0 || minutes >=60;

        if (isMinutesValid)
            throw new IllegalArgumentException("minutes should be between 0 and 59");
        this.minutes = minutes;
    }

    public int getMinute(){
        return minutes;
    }

    public void setSeconds(int  seconds){
        boolean isSecondsValid = seconds < 0 || seconds >=60;

        if (isSecondsValid)
            throw new IllegalArgumentException("seconds should be between 0 and 59");
        this.seconds = seconds;
    }

    public int getSeconds(){
        return seconds;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSeconds());
    }

    @Override
    public String toString(){
        String prompt;
        if (getHour() < 12)
            prompt = "AM";
        else
            prompt = "PM";
        if(getHour() == 0 || getHour() == 12)
            hour = 12;
        else
            hour = getHour() % 12;
        return String.format("%02d:%02d:%02d %s", getHour(), getMinute(), getSeconds(), prompt);
    }

    private void validateTime(int hour, int minutes, int seconds) {
        boolean isHourValid = hour < 0 || hour >=24;
        boolean isMinuteValid = minutes < 0 || minutes >=60;
        boolean isSecondsValid = seconds < 0 || seconds >= 60;

        if (isHourValid)
            throw new IllegalArgumentException("hours should be between 0 and 23");
        if(isMinuteValid)
            throw new IllegalArgumentException("minutes should be between 0 and 59");
        if(isSecondsValid)
            throw new IllegalArgumentException("seconds should be between 0 and 59");

        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

}

class TimeTest{
    public static void main(String[] args) {
        ConstructorOverloading time1 = new ConstructorOverloading();
        ConstructorOverloading time2 = new ConstructorOverloading(2);
        ConstructorOverloading time3 = new ConstructorOverloading(18, 45);
        ConstructorOverloading time4 = new ConstructorOverloading(21, 45,57);
        ConstructorOverloading time5 = new ConstructorOverloading(time2);

        printTime("all default time", time1);
        printTime("hour set only constructor", time2);
        printTime("Constructor with hour and minute set", time3);
        printTime("constructor with all time parameter set", time4);
        printTime("Constructor with reference time", time5);

        try {
            time1.setTime(23, 62, 57);
            }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage() + Arrays.toString(e.getStackTrace()));
        }



    }

    public static void printTime(String message, ConstructorOverloading time){
        System.out.println(message);
        System.out.println(time.toUniversalString());
        System.out.println(time.toString());
    }
}