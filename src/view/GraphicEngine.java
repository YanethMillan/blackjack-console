package view;
import model.Card;
import java.util.ArrayList;

public class GraphicEngine
{
    //Este metodo imprime todas las cartas en el mazo
    public void printHand(ArrayList<Card> hand)
    {
        int cardsPerRow = 4;

        for (int i = 0; i < hand.size(); i += cardsPerRow) {
            StringBuilder row1 = new StringBuilder();
            StringBuilder row2 = new StringBuilder();
            StringBuilder row3 = new StringBuilder();
            StringBuilder row4 = new StringBuilder();
            StringBuilder row5 = new StringBuilder();

            int end = Math.min(i + cardsPerRow, hand.size());
            for (int j = i; j < end; j++) {
                Card card = hand.get(j);
                String r = card.getRank();
                String s = card.getValue();
                String spacing = r.equals("10") ? "" : " ";

                row1.append("+-----+  ");
                row2.append("|").append(r).append(spacing).append("   |  ");
                row3.append("|  ").append(s).append("  |  ");
                row4.append("|   ").append(spacing).append(r).append("|  ");
                row5.append("+-----+  ");
            }

            // Imprimimos este bloque y un salto de línea
            System.out.println(row1);
            System.out.println(row2);
            System.out.println(row3);
            System.out.println(row4);
            System.out.println(row5);
            System.out.println(); // Espacio entre filas de cartas
        }
    }
}
