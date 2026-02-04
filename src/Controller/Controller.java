package Controller;
import model.Deck;
import model.Card;

public class Controller {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.fillDeck();
        deck.shuffle();

        for (Card card : deck.getCards()){
            System.out.println(card.getName());
        }


    }
}
