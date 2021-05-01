import java.util.Arrays;

public class DeckOfCards {
    private Card deckOfCards[];
    private static int NUMBER_OF_CARDS = 52;

    public DeckOfCards(Card[] deckOfCards) {
        this.deckOfCards = deckOfCards;
    }
    public DeckOfCards(){
        deckOfCards = new Card[NUMBER_OF_CARDS];
    }
    public void fillDeckOfCards(){
        for (int rank=Card.getMinRank(); rank<= Card.getMaxRank(); rank++){
            for (int suit=0; suit<4; suit++){
                deckOfCards[rank * suit] = new Card(suit, rank);
            }
        }
    }
    public void displayDeckOfCards(){
        System.out.println(this.toString());
    }
    public void displayCard(int i){
        System.out.println(deckOfCards[i].toString());
    }
    @Override
    public String toString() {
        String s = "";
        for (int i=0; i<NUMBER_OF_CARDS; i++){
            s += deckOfCards[i].toString() + " ";
        }
        return s;
    }
}
