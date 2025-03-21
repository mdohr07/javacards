package aufgaben.playingCards;

public enum Value {
    ACE("A"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K");

    private final String symbol;

    Value(String symbol) {
        this.symbol = symbol;
    }

    // Getter-Methode für das Symbol
    public String getValue() {
        return symbol;
    }
}
