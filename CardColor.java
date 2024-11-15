package aufgaben.playingCards;

public enum CardColor {
    CLUBS('\u2663'),
    SPADES('\u2660'),
    DIAMONDS('\u2666'),
    HEARTS('\u2665');

    private char cardColor;

    CardColor(char cardColor) {
        this.cardColor = cardColor;
    }

// GETTER & SETTER
    public char getCardColor() {
        return cardColor;
    }

}

