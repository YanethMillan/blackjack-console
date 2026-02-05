package model;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards;

    //Nuestras opciones de cartas, son final porque no van a cambiar, así prevenimos que otros programadores los modifiquen por accidente
    final String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    final String[] suits = {"♠", "♥", "♦", "♣"};

    public Deck()
    {
        cards = new ArrayList<Card>();
    }
    public void fillDeck()
    {
        for (String s : suits)
        {
            for (String r : ranks)
            {
                this.cards.add(new Card(r, s));
            }
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
