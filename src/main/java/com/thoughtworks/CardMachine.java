package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class CardMachine {
    private int numberN;
    private List<Integer> randomNums;

    public CardMachine() {
    }

    public CardMachine(int numberN, List<Integer> randomNums) {
        this.numberN = numberN;
        this.randomNums = randomNums;
    }

    public int getNumberN() {
        return numberN;
    }

    public void setNumberN(int numberN) {
        this.numberN = numberN;
    }

    public List<Integer> getRandomNums() {
        return randomNums;
    }

    public void setRandomNums(List<Integer> randomNums) {
        this.randomNums = randomNums;
    }

    public List<String> drawCard(Card card) {
        int randomNum;
        int colorIndex;
        int numIndex;
        List<String> cards = new ArrayList<String>();
        for (int i = 0; i < numberN; i++) {
            randomNum = randomNums.get(i);
            colorIndex = randomNum / 13;
            numIndex = randomNum % 13;
            card.setCard(card.getCardColors()[colorIndex] + card.getCardNumber()[numIndex]);
            cards.add(card.getCard());
        }
        return cards;
    }
}
