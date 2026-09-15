import java.util.Scanner;
import java.util.Random;

public class exercise_02 {
        public static void main(String[] args) {

            // Scanner is used to take input from the user
            Scanner sc = new Scanner(System.in);

            // Random is used to generate the computer's choice
            Random random = new Random();

            // Display game title
            System.out.println("================================");
            System.out.println("     ROCK PAPER SCISSORS GAME");
            System.out.println("================================");

            // Show choices to the user
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");

            // Ask the user to enter their choice
            System.out.print("Enter your choice (1-3): ");
            int userChoice = sc.nextInt();

            // Computer randomly chooses 1, 2, or 3
            int computerChoice = random.nextInt(3) + 1;

            // Display user's choice
            System.out.println();

            if (userChoice == 1) {
                System.out.println("You chose: Rock");
            }
            else if (userChoice == 2) {
                System.out.println("You chose: Paper");
            }
            else if (userChoice == 3) {
                System.out.println("You chose: Scissors");
            }
            else {
                // If user enters anything other than 1, 2, or 3
                System.out.println("Invalid choice!");
                sc.close();
                return;
            }

            // Display computer's choice
            if (computerChoice == 1) {
                System.out.println("Computer chose: Rock");
            }
            else if (computerChoice == 2) {
                System.out.println("Computer chose: Paper");
            }
            else {
                System.out.println("Computer chose: Scissors");
            }

            System.out.println();

            // Check the result of the game

            // If both choices are same, it is a draw
            if (userChoice == computerChoice) {
                System.out.println("Result: DRAW! 🤝");
            }

            // Rock beats Scissors
            else if (userChoice == 1 && computerChoice == 3) {
                System.out.println("Result: YOU WIN! 🎉");
            }

            // Paper beats Rock
            else if (userChoice == 2 && computerChoice == 1) {
                System.out.println("Result: YOU WIN! 🎉");
            }

            // Scissors beats Paper
            else if (userChoice == 3 && computerChoice == 2) {
                System.out.println("Result: YOU WIN! 🎉");
            }

            // In all other cases, computer wins
            else {
                System.out.println("Result: COMPUTER WINS! 🤖");
            }

            // Close Scanner
            sc.close();
        }
    }

