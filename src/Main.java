public class Main {
    public static void main(String[] args) {
        DeckOfCards cards = new DeckOfCards();
        cards.fillDeckOfCards();
        for (int i=0; i<52; i++)
            cards.displayCard(i);
        //cards.displayDeckOfCards();
    }
}
