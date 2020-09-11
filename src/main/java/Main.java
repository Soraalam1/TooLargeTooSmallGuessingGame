import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void GuessingGame(){
        int tries = 1;
        Random randomizer = new Random();
        int correctNumber = randomizer.nextInt(10)+1;
        boolean solved = false;
        int[] recordOfGuesses = new int[10];

        String tooLargeMessage = "You tried it. Your guess was too high. Try going lower!";
        String tooSmallMessage = "You tried it. Your guess was too small! Try going higher!";
        System.out.println("Welcome to the numbers game! Guess a number between 1-10.");
        //System.out.println(correctNumber);


        while (solved == false)
        {
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            if (userInput == correctNumber && tries == 1)
            {
                System.out.println("Wow, you got in on your first try! Winner!");
                solved = true;
            }
            else if (userInput == correctNumber)
            {
                System.out.println("You finally got it. Attempts: " + tries);
                solved = true;
            }
            else if (userInput > 10 || userInput < 1)
            {
                System.out.println("Stop breaking the rules!");
            }
            else if (userInput < correctNumber) {
                System.out.println(tooSmallMessage);
                if (userInput != recordOfGuesses[userInput]) {
                    recordOfGuesses[userInput] = userInput;
                    tries++;
                }
            }
            else if (userInput > correctNumber) {
                    System.out.println(tooLargeMessage);
                    if (userInput != recordOfGuesses[userInput-1]) {
                        recordOfGuesses[userInput-1] = userInput;
                        tries++;
                    }
                }
            }

        }
    public static void main(String[] args) {
        GuessingGame();
    }
}
