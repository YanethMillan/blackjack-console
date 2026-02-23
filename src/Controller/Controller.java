package Controller;

import model.Deck;
import model.Hand;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.fillDeck();
        deck.shuffle();

        Hand playerHand = new Hand();
        Hand machineHand = new Hand();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Blackjack 21");

        playerHand.addCard(deck.giveCard());
        playerHand.addCard(deck.giveCard());

        machineHand.addCard(deck.giveCard());
        machineHand.addCard(deck.giveCard());

        System.out.println("Your starting points: " + playerHand.sumScore());

        boolean playerTurn = true;
        boolean gameOver = false;

        while (playerTurn) {

            System.out.println("Do you want to Hit or Stand?");
            String option = scanner.nextLine();

            if (option.equals("Hit")) {

                playerHand.addCard(deck.giveCard());
                System.out.println("Your current points: " + playerHand.sumScore());

                if (playerHand.bust()) {
                    System.out.println("You lose!");
                    gameOver = true;
                    playerTurn = false;
                }
            }
            else if (option.equals("hit")) {

                playerHand.addCard(deck.giveCard());
                System.out.println("Your current points: " + playerHand.sumScore());

                if (playerHand.bust()) {
                    System.out.println("You lose!");
                    gameOver = true;
                    playerTurn = false;
                }
            }
            else if (option.equals("Stand")) {
                playerTurn = false;
            }
            else if (option.equals("stand")) {
                playerTurn = false;
            }
            else {
                System.out.println("Invalid option. Please type Hit or Stand.");
            }
        }

        if (gameOver) {
            return;
        }

        System.out.println("T-1000 is playing...");

        int machinePoints = machineHand.sumScore();

        while (machinePoints < 17) {
            machineHand.addCard(deck.giveCard());
            machinePoints = machineHand.sumScore();
        }

        System.out.println("T-1000 points: " + machineHand.sumScore());
        
        int playerScore = playerHand.sumScore();
        int finalMachineScore = machineHand.sumScore();

        if (machineHand.bust()) {
            System.out.println("T-1000 busted. You win!");
        }
        else if (playerScore > finalMachineScore) {
            System.out.println("You win!");
        }
        else if (playerScore < finalMachineScore) {
            System.out.println("You lose against T-1000.");
        }
        else {
            System.out.println("It's a tie.");
        }
    }
}
