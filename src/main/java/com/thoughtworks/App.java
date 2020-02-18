package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入想要抽的扑克牌数");
    int n = scanner.nextInt();
    judgeN(n);

    //洗牌
    List<Integer> listN = new ArrayList<>();
    getCardRandomNum(n, listN);

    //抽牌
    CardMachine cardMachine = new CardMachine(listN);
    List<Card> cards = cardMachine.drawCard(n);

    //亮牌
    printCards(cards);
  }

  public static void judgeN(int n) {
    if (n < 1) {
      System.out.println("输入的抽取牌数过小，请输入1到52之间的数");
    } else if (n > 52) {
      System.out.println("输入的抽取牌数过大，请输入1到52之间的数");
    }
  }

  public static List<Integer> getCardRandomNum(int n, List<Integer> list) {
    Random random = new Random();
    int num;
    while (list.size() < n) {
      num = random.nextInt(52);
      if (!list.contains(num)) {
        list.add(num);
      }
    }
    return list;
  }

  public static void printCards(List<Card> cards) {
    for (int i = 0; i < cards.size()-1; i++) {
      System.out.printf(cards.get(i).getCard() + " ");
    }
    System.out.println(cards.get(cards.size()-1).getCard());
  }
}
