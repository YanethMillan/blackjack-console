package model;

public class Card {
   private String rank; // "A", "2", "10", "K"
    private String value; // "♠", "♥", "♦", "♣"

    public Card(String name, String value) {
        this.rank = name;
        this.value = value;
    }

    public String getRank() {
        return rank;
    }

    public String getValue() {
        return value;
    }

    //Este metodo es solo para darle formato a la impresion
    public String getFormattedRank() {
        if (rank.equals("10"))
        {
            return rank;
        }
        else
        {
            return rank + " ";
        }
    }
}
