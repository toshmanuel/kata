package Polymorphic_Class.Toni;

import java.time.Year;

public class HeartRateCalculator {

    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public HeartRateCalculator(String firstName, String lastName, int dayOfBirth,
                               int monthOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String dateOfBirth(){
        return dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;
    }

    public int calculateAge(){
        return Year.now().getValue() - yearOfBirth;
    }

    public int calculateMaximumHeartRate(){
        return 220 - calculateAge();
    }

    public String calculateTargetHeartRate(){
        return ((0.5 * calculateMaximumHeartRate()) + "-" + (0.85 * calculateMaximumHeartRate()));
    }
}
