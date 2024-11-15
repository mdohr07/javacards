package aufgaben.playingCards;
import java.util.Collections;
import java.util.Stack;

public class Deck {
    Stack<Card> cardDeck = new Stack <>();

    public Deck() {
        assembleDeck();
    }

    // Erzeugt alle Kombinationen von Farben und Werten
    private void assembleDeck() {
        cardDeck.clear();
        for (CardColor color : CardColor.values()) {
            for (Value value : Value.values()) {
                cardDeck.push(new Card(color, value)); // push ist wie add aber spezifisch für Stacks
            }
        }
    }

    // Mischt das Deck
    public void shuffle() {
        Collections.shuffle(cardDeck);
        System.out.println("Deck has been shuffled.");
    }

    // Zieht die oberste Karte
    public Card drawCard() {
        if (!cardDeck.isEmpty()) {
            return cardDeck.pop();
        } else {
            System.out.println("The deck is empty!");
            return null;
        }
    }
}
