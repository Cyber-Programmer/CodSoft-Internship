//CODSOFT Internship Batch A-2
//Number Guessing Game
import java.util.Random;
import java.util.Scanner;


public class Ran_Num_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int totalScore = 0;
        boolean playAgain = true;

        System.out.println("Welcome to Random Number Game.");
        System.out.println("You Have Three Levels Starting From Easy To Hard.");
        System.out.println("You'll Start From Easy Rounds.");
        System.out.println("Good Luck :)\n");

        while (playAgain) {
            int score = 0;
            int tries = 0;
            int scoreAdder = 0;
            int maxRandomNumber = 0;

            System.out.println("Choose Your Level:");
            System.out.println("1. Easy (15 tries, 5 points per correct guess)");
            System.out.println("2. Normal (10 tries, 10 points per correct guess)");
            System.out.println("3. Hard (5 tries, 20 points per correct guess)");
            System.out.print("Enter the level number or '0' to quit: ");

            int levelChoice = input.nextInt();
            input.nextLine(); 

            if (levelChoice == 0) {
                playAgain = false;
                continue;
            } else if (levelChoice == 1) {
                tries = 15;
                scoreAdder = 5;
                maxRandomNumber = 100;
            } else if (levelChoice == 2) {
                tries = 10;
                scoreAdder = 10;
                maxRandomNumber = 200;
            } else if (levelChoice == 3) {
                tries = 5;
                scoreAdder = 20;
                maxRandomNumber = 300;
            } else {
                System.out.println("Invalid level choice. Please select a valid level.");
                continue;
            }

            int targetNumber = ran.nextInt(1, maxRandomNumber + 1);

            System.out.println("Guess the number between 1 and " + maxRandomNumber + ". You have " + tries + " tries.");

            for (int i = 0; i < tries; i++) {
                System.out.print("Enter your guess: ");
                int guess = input.nextInt();

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score += scoreAdder;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Try a higher number. Tries left: " + (tries - i - 1));
                } else {
                    System.out.println("Try a lower number. Tries left: " + (tries - i - 1));
                }

                if (i == tries - 1) {
                    System.out.println("Sorry, you've used all your tries. The correct number was " + targetNumber + ".");
                }
            }

            System.out.println("Your score for this round: " + score);
            totalScore += score;

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgainChoice = input.next().toLowerCase();
            input.nextLine(); 

            if (!playAgainChoice.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Game over! Your total score: " + totalScore);
        System.out.println("Thank you for playing!");
    }
}

