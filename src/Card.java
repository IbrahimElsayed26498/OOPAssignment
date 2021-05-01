public class Card {
    private String suit;
    private int rank;
    private static final String suits[] =
            {"SPADES", "HEARTS", "DIAMONDS", "CLUBS"};
    private static final int MIN_RANK = 1;
    private static final int MAX_RANK = 13;

    public Card(int suit, int rank) {
        setRank(rank);
        setSuit(suit);
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        if (suit < 0 || suit > 3){
            System.out.println("Suit must be between 0 and 3");
            return;
        }
        this.suit = suits[suit];
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if (rank <= MIN_RANK || rank > MAX_RANK)
            return;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    public static int getMaxRank() {
        return MAX_RANK;
    }

    public static int getMinRank() {
        return MIN_RANK;
    }

    public static String[] getSuits() {
        return suits;
    }
}
