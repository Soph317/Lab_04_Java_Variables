
public class Main {
    public static void main(String[] args) {

        int intOperandA = 51;
        int intOperandB = 5;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;
        double doubleOperandA = 3.50;
        double doubleOperandB = 6.20;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        int kidsInFamily = 3;
        boolean isItRaining = true;
        double gasPrice = 3.50;
        int favoriteNumber = 3;
        double shoeSize = 5.5;
        String birthMonth = "January";
        String fullName = "Sophie Lefebvre";


        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The remainder using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);

        System.out.println("Number of kids in family: " + kidsInFamily);
        System.out.println("Is it raining: " + isItRaining);
        System.out.println("Gas price per gallon: " + gasPrice);
        System.out.println("Favorite Number: " + favoriteNumber);
        System.out.println("Shoe size: " + shoeSize);
        System.out.println("Birth month: " + birthMonth);
        System.out.println("Full name: " + fullName);
    }
}
