package model;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int sumScore() {
        int sum = 0;
        int aceCount = 0;

        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            String rank = card.getRank();

            if (rank.equals("J")) {
                sum = sum + 10;
            }
            else if (rank.equals("Q")) {
                sum = sum + 10;
            }
            else if (rank.equals("K")) {
                sum = sum + 10;
            }
            else if (rank.equals("A")) {
                sum = sum + 11;
                aceCount = aceCount + 1;
            }
            else if (rank.equals("2")) {
                sum = sum + 2;
            }
            else if (rank.equals("3")) {
                sum = sum + 3;
            }
            else if (rank.equals("4")) {
                sum = sum + 4;
            }
            else if (rank.equals("5")) {
                sum = sum + 5;
            }
            else if (rank.equals("6")) {
                sum = sum + 6;
            }
            else if (rank.equals("7")) {
                sum = sum + 7;
            }
            else if (rank.equals("8")) {
                sum = sum + 8;
            }
            else if (rank.equals("9")) {
                sum = sum + 9;
            }
            else if (rank.equals("10")) {
                sum = sum + 10;
            }
        }
        while (sum > 21 && aceCount > 0) {
            sum = sum - 10;
            aceCount = aceCount - 1;
        }
        return sum;
    }

    public boolean bust(){
        return sumScore() > 21;
    }
}





        /*
        tiene una lista de cartas

        método addCard(carta):
        agregar la carta a la lista

        método sumScore():
        recorrer todas las cartas
        convertir cada carta a puntos de blackjack
        sumar esos puntos
        regresar la suma

        método bust():
        si sumScore() > 21
        regresar true
        si no
        regresar false
        */