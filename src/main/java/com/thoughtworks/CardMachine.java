package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class CardMachine {
    private List<Integer> randomNums;

    public CardMachine() {
    }

    public CardMachine(List<Integer> randomNums) {
        this.randomNums = randomNums;
    }

    public List<Integer> getRandomNums() {
        return randomNums;
    }

    public void setRandomNums(List<Integer> randomNums) {
        this.randomNums = randomNums;
    }

    public List<Card> drawCard(int n) {
        int randomNum;
        int colorIndex;
        int numIndex;
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Card card = new Card();
            randomNum = randomNums.get(i);
            colorIndex = randomNum / 13;
            numIndex = randomNum % 13;
            card.setCard(card.getCardColors()[colorIndex] + card.getCardNumbers()[numIndex]);
            cards.add(card);
        }
        return cards;
    }


}
