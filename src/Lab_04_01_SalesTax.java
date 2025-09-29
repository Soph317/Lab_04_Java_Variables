import java.util.Scanner;

public class Lab_04_01_SalesTax {
    public static void main(String[] args) {
        double salesTaxTotal;
        double totalPrice;
        double price;
        System.out.println("What is the price of your purchase?");
        Scanner in = new Scanner(System.in);

        price = in.nextDouble();

        in.close();

        salesTaxTotal = price * .05;
        totalPrice = price + salesTaxTotal;

        System.out.println("Your item cost: " + price);
        System.out.printf("Your sales tax: $%.2f%n", salesTaxTotal);
        System.out.printf("Your total price is: $%.2f%n", totalPrice);





    }
}