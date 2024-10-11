import java.util.Scanner;

public class DoWhilePractice {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        // Question 1
        System.out.println("Provide number to determine sum of natural numbers until.");
        printSum(myScanner.nextInt());


        // Question 2
        System.out.println("Provide number to print product table of.");
        printProductTable(myScanner.nextInt());
    }

    public static void printSum(int targetValue)
    {
        int returnValue;
        int n;

        returnValue = 0;
        n = 0;
        do {
            returnValue+=n;
            n++;
        } while (n <= targetValue);
        System.out.println(returnValue);
    }

    public static void printProductTable(int targetValue)
    {
        int divisor;
        int n = 1;
        do {
            if (targetValue % n == 0)
            {
                divisor = targetValue / n;
                System.out.println(n + " * " + divisor + " = " + targetValue);
            }
            n++;
        } while (n <= targetValue);
    }
}
