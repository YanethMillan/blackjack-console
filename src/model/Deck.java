package model;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
    }
    public void fillDeck() {
        for (int i = 1; i <= 52; i++) {
            Card card = new Card("Card " + i, i);
            cards.add(card);
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card giveCard() {
        return cards.remove(0);
    }

    public ArrayList<Card> getCards(){
        return cards;
    }
}
