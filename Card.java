package aufgaben.playingCards;

public class Card {

    private CardColor color;
    private Value value;

    public Card(CardColor color, Value value) {
        this.color = color;
        this.value = value;
    }

    public CardColor getColor() { return color; }

    public Value getValue() { return value; }

    @Override
    public String toString() {
        return color.getCardColor() + " " + value.getValue();

    }
}
