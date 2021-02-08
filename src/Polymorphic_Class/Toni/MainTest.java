package Polymorphic_Class.Toni;


public class MainTest {
    public static void main(String[] args) {
        HeartRateCalculator pat1 = new HeartRateCalculator("", "", 0, 0, 0);

        pat1.setFirstName("Toni");
        pat1.setLastName("Adeniyi");
        pat1.setDayOfBirth(29);
        pat1.setMonthOfBirth(7);
        pat1.setYearOfBirth(1997);
        String DOB = pat1.dateOfBirth();
        int maxHeartRate =  pat1.calculateMaximumHeartRate();
        String targetRate = pat1.calculateTargetHeartRate();

        System.out.println(pat1.getFirstName());
        System.out.println(pat1.getLastName());
        System.out.println(DOB);
        System.out.println(maxHeartRate);
        System.out.println(targetRate);

    }
}
