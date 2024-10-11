import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        findMultiples();
        findHiddenNumber();
    }

    public static void findMultiples()
    {
        final int targetMultiple = 7;
        final int searchArea = 100;
        final String myName = "Elden";

        for (int n = 1; n <= searchArea; n++) {
            if (n % targetMultiple == 0)
            {
                System.out.println(myName);
            }
        }
    }

    public static void findHiddenNumber() {
        final int hiddenNumber = 22;

        Scanner userInput = new Scanner(System.in);

        for (int chances = 3; chances > 0; chances--){
            System.out.println("The hidden number is between 1 and 100. What is your guess? You have " + chances + " chances remaining.");
            if (userInput.nextInt() == hiddenNumber)
            {
                System.out.println("You found the hidden number!");
                break;
            }
            else{
                System.out.println("Incorrect.");
            }
        }
    }
}