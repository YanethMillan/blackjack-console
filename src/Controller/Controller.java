package Controller;
import model.Deck;
import model.Card;
import view.GraphicEngine;

import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {

        Deck deck = new Deck();
        GraphicEngine graphicEngine = new GraphicEngine();

        deck.fillDeck();
        deck.shuffle();
        ArrayList<Card> cards = deck.getCards();

        //Este metodo puede ser comentado, solo lo puse para imprimir las cartas
        graphicEngine.printHand(cards);


    }
}
