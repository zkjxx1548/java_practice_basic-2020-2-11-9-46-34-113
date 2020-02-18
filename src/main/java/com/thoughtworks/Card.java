package com.thoughtworks;

public class Card {
    private static final String[] CARD_COLORS = new String[] {"黑桃", "红桃", "梅花", "方片"};
    private static final String[] CARD_NUMBERS = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private String card;

    public static String[] getCardColors() {
        return CARD_COLORS;
    }

    public static String[] getCardNumbers() {
        return CARD_NUMBERS;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
