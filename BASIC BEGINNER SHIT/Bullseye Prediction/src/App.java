import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name? ");
        String userName = in.nextLine();

        finalOutput(userName);
    }

    private static int statistics() throws Exception {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Amount of bullseyes you have achieved this year: ");
                int totalBull = in.nextInt();
                return totalBull; // 50
            } catch (Exception e) {
                System.out.println("Incorrect value. Please only respond with integers.");
                statistics();
            }
        }
    }

    private static int bullseyeCalculation(int bullNum) throws Exception { // Slight AI assistance. Maths was all my calculation
        LocalDate date = LocalDate.now();
        int daysInto = date.getDayOfYear();
        int daysInYear = date.lengthOfYear();

        float yearPercent = (daysInto / (float) daysInYear) * 100; // Could use double (64-bit) for more precision. (float) forces float division
        float bullMultiplier = (100 / yearPercent);

        int bullEstimate = Math.round(bullMultiplier * bullNum);
        return bullEstimate;
    }

    private static void finalOutput(String userName) throws Exception {
        int bullNum = statistics();
        int roughEstimation = bullseyeCalculation(bullNum);
        int higherBound = Math.round(roughEstimation * 1.1f);
        int lowerBound = Math.round(roughEstimation * 0.9f);

        System.out.println(userName + " has " + bullNum + " bullseyes since the start of the year");
        Thread.sleep(500);
        System.out.println("Calculating...");
        Thread.sleep(1000);

        System.out.println(userName + " is projected to achieve " + roughEstimation + " bullseyes by the end of the year.");
        System.out.println("With utmost greatness, " + userName + " may achieve ~" + higherBound + " bullseyes.");
        System.out.println("Although, " + userName + " could face a significant skill issue, which may result in ~" + lowerBound + " bullseyes.");
    }
}
