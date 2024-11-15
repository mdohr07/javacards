package aufgaben.playingCards;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        // Das Deck mischen
        deck.shuffle();

        // Eine zufällige Karte ziehen und ausgeben
        Card randomCard = deck.drawCard();
        if (randomCard != null) {
            System.out.println("You drew: " + randomCard);
        }
    }
}
