import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public int numberOfCards() {
        return this.cards.size();
    }


    public void addCard(Card card) {
        this.cards.add(card);
    }

    public Card makeCard() {
        Card card = new Card(SuitType.SPADES, RankType.ACE);
        return card;
    }

    public void makeCardset(){
        SuitType suits[] = SuitType.values();
        RankType ranks[] = RankType.values();

        for (SuitType suit : suits){
            for (RankType rank : ranks){
                Card card = new Card(suit, rank);
                addCard(card);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }
}
