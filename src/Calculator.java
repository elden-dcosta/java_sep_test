import java.util.Scanner;

public class Calculator {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

         final int ARBITRARY_HIGH_NUMBER = 10;

        int menuSelectionValue = ARBITRARY_HIGH_NUMBER;

        System.out.println("Welcome to the calculator. Please select one of the following menu options to continue.");
        System.out.println("1 = Addition");
        System.out.println("2 = Subtraction");
        System.out.println("3 = Multiplication");
        System.out.println("4 = Division");
        System.out.println("5 = Modulus");
        System.out.println("0 = Exit");

        do
        {
            System.out.println("");
            System.out.println("Enter selection now.");

            menuSelectionValue = userInput.nextInt();
            switch(menuSelectionValue)
            {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    modulus();
                    break;
                case 0:
                    System.out.println("");
                    System.out.println("Exiting calculator. Bye!");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }


        } while (menuSelectionValue != 0);
    }

    public static void addition()
    {
        int leftNum;
        int rightNum;
        int sum;

        System.out.println("");
        System.out.println("Enter first number to be added.");
        leftNum = userInput.nextInt();

        System.out.println("");
        System.out.println("Enter second number to be added.");
        rightNum = userInput.nextInt();

        sum = leftNum + rightNum;
        System.out.println("");
        System.out.println("The sum of these values is " + sum);

    }

    public static void subtraction()
    {
        int leftNum;
        int rightNum;
        int difference;

        System.out.println("");
        System.out.println("Enter the number to be subtracted from.");
        leftNum = userInput.nextInt();

        System.out.println("");
        System.out.println("Enter the number to subtract.");
        rightNum = userInput.nextInt();

        difference = leftNum - rightNum;
        System.out.println("");
        System.out.println("The difference of these values is " + difference);
    }

    public static void multiplication()
    {
        int leftNum;
        int rightNum;
        int product;

        System.out.println("");
        System.out.println("Enter the first number to multiply.");
        leftNum = userInput.nextInt();

        System.out.println("");
        System.out.println("Enter the second number to multiply.");
        rightNum = userInput.nextInt();

        product = leftNum * rightNum;
        System.out.println("");
        System.out.println("The product of these values is " + product);

    }

    public static void division()
    {
        int leftNum;
        int rightNum;
        int quotient;

        System.out.println("");
        System.out.println("Enter the dividend.");
        leftNum = userInput.nextInt();

        System.out.println("");
        System.out.println("Enter the divisor.");
        rightNum = userInput.nextInt();

        quotient = leftNum / rightNum;
        System.out.println("");
        System.out.println("The quotient of these values is " + quotient);

    }

    public static void modulus()
    {
        int leftNum;
        int rightNum;
        int remainder;

        System.out.println("");
        System.out.println("Enter the divident.");
        leftNum = userInput.nextInt();

        System.out.println("");
        System.out.println("Enter the divisor.");
        rightNum = userInput.nextInt();

        remainder = leftNum % rightNum;
        System.out.println("");
        System.out.println("The remainder of these values is " + remainder);
    }
}
