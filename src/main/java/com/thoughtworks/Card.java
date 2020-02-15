package com.thoughtworks;

public class Card {
    private final String[] cardColors = new String[] {"黑桃", "红桃", "梅花", "方片"};
    private final String[] cardNumber = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private String card;

    public String[] getCardColors() {
        return cardColors;
    }

    public String[] getCardNumber() {
        return cardNumber;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
