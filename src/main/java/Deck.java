import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }



    public int numberOfCards() {
        return this.cards.size();
    }
}
