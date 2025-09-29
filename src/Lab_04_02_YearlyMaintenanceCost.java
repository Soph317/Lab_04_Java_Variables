import java.util.Scanner;

public class Lab_04_02_YearlyMaintenanceCost {
    public static void main(String[] args) {

        double sprCost;
        double sumCost;
        double fallCost;
        double winCost;
        double yearlyMaintenanceCost;


        System.out.println("What is the cost of your Spring maintenance?");
        Scanner in = new Scanner(System.in);
        sprCost = in.nextDouble();

        System.out.println("What is the cost of your Summer maintenance?");
        sumCost = in.nextDouble();

        System.out.println("What is the cost of your Fall maintenance?");
        fallCost = in.nextDouble();

        System.out.println("What is the cost of your Winter maintenance?");
        winCost = in.nextDouble();


        yearlyMaintenanceCost = sprCost + sumCost + fallCost + winCost;
        System.out.println("Your Yearly maintenance cost is: " + yearlyMaintenanceCost);
        System.out.println("Your Spring cost: " + sprCost);
        System.out.println("Your Summer cost: " + sumCost);
        System.out.println("Your Fall cost: " + fallCost);
        System.out.println("Your Winter cost: " + winCost);

        in.close();
    }
}