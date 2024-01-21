package task4;

import java.util.Random;
import java.util.Scanner;

public class Task47 {
	
	
	
	  public static void main(String[] args) {
	  
	            Scanner scanner = new Scanner(System.in);
	            Random random = new Random();

	            int roundsToPlay = 5;
	            int playerScore = 0;
	            int computerScore = 0;

	            for (int round = 1; round <= roundsToPlay; round++) {
	                System.out.println("Round " + round);
	                System.out.println("Enter your choice (rock, paper, or scissors): ");
	                String playerChoice = scanner.nextLine().toLowerCase();

	                // Generate computer's choice randomly
	                String[] choices = {"rock", "paper", "scissors"};
	                int randomIndex = random.nextInt(choices.length);
	                String computerChoice = choices[randomIndex];

	                System.out.println("Computer's choice: " + computerChoice);

	                // Determine the winner of the round
	                String roundWinner = determineRoundWinner(playerChoice, computerChoice);

	                // Update scores
	                if (roundWinner.equals("player")) {
	                    playerScore++;
	                } else if (roundWinner.equals("computer")) {
	                    computerScore++;
	                }

	                System.out.println("Round " + roundWinner + "!\n");
	            }

	            // Determine the overall winner
	            String overallWinner = determineOverallWinner(playerScore, computerScore);

	            System.out.println("Game Over!");
	            System.out.println("Player score: " + playerScore);
	            System.out.println("Computer score: " + computerScore);
	            System.out.println("Overall winner: " + overallWinner);

	            scanner.close();
	        }

	        private static String determineRoundWinner(String playerChoice, String computerChoice) {
	            if (playerChoice.equals(computerChoice)) {
	                return "tie";
	            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
	                       (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
	                       (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
	                return "player";
	            } else {
	                return "computer";
	            }
	        }

	        private static String determineOverallWinner(int playerScore, int computerScore) {
	            if (playerScore > computerScore) {
	                return "Player";
	            } else if (playerScore < computerScore) {
	                return "Computer";
	            } else {
	                return "It's a tie!";
	            }
	        }
	    }



