public class Lab_04_03_MonthyCCBalance {
    public static void main(String[] args) {
        double cardBalance = 5000.0;
        double interestRate = .17;
        double firstMonth;
        double secondMonth;
        double monthlyInterest;

        monthlyInterest = interestRate / 12;
        firstMonth = monthlyInterest * cardBalance;
        cardBalance = firstMonth + cardBalance;

        System.out.printf("Balance after 1 month: $%.2f%n", firstMonth);
        System.out.printf("Credit Card Balance: $%.2f%n", cardBalance);

        secondMonth = cardBalance * monthlyInterest;
        cardBalance = cardBalance + secondMonth;

        System.out.printf("Balance after 1 month: $%.2f%n", secondMonth);
        System.out.printf("Credit Card Balance: $%.2f%n", cardBalance);
    }
}
