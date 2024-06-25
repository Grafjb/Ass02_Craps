import java.util.Random;
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random rnd = new Random();
            boolean playAgain = true;

            while (playAgain) {
                System.out.println("Rolling the dice...");
                int die1 = rnd.nextInt(6) + 1;
                int die2 = rnd.nextInt(6) + 1;
                int initialSum = die1 + die2;

                System.out.println("You rolled a " + die1 + " and a " + die2 + " for a sum of " + initialSum);

                if (initialSum == 2 || initialSum == 3 || initialSum == 12) {
                    System.out.println("Craps! You crapped out.");
                } else if (initialSum == 7 || initialSum == 11) {
                    System.out.println("Natural! You win!");
                } else {
                    int point = initialSum;
                    System.out.println("The point is now " + point);
                    boolean gameContinues = true;

                    while (gameContinues) {
                        System.out.println("Rolling the dice again...");
                        die1 = rnd.nextInt(6) + 1;
                        die2 = rnd.nextInt(6) + 1;
                        int newSum = die1 + die2;

                        System.out.println("You rolled a " + die1 + " and a " + die2 + " for a sum of " + newSum);

                        if (newSum == point) {
                            System.out.println("You made the point! You win!");
                            gameContinues = false;
                        } else if (newSum == 7) {
                            System.out.println("You rolled a 7! You lose.");
                            gameContinues = false;
                        } else {
                            System.out.println("Trying for point " + point);
                        }
                    }
                }

                System.out.print("Do you want to play again? (yes/no): ");
                String response = scanner.next();
                playAgain = response.equalsIgnoreCase("yes");
            }

            System.out.println("Thanks for playing!");
            scanner.close();
        }
    }

