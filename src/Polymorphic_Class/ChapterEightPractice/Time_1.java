package Polymorphic_Class.ChapterEightPractice;

public class Time_1 {
    private int hour;
    private int minute;
    private int seconds;

    public Time_1(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public String buildTime() {
        return String.format("%24s: %s%n%24s: %s",
                "toUniversalString",
                toUniversalString(),
                "this.toUniversalString",
                this.toUniversalString());
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",hour, minute,seconds);
    }

}

class Time_2{
    public static void main(String[] args) {
        Time_1 time_1 = new Time_1(12, 30, 4);
        System.out.println(time_1.buildTime());
    }
}
