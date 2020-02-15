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
    List<Integer> listN = new ArrayList<Integer>();
    Random random = new Random();
    int num;
    for (int i = 0; i < n; i++) {
      num = random.nextInt(52);
      listN.add(num);
    }

    //抽牌
    CardMachine cardMachine = new CardMachine(n, listN);
    Card card = new Card();
    List<String> cards = cardMachine.drawCard(card);

    printCards(cards);
  }

  public static void judgeN(int n) {
    if (n < 1) {
      System.out.println("输入的抽取牌数过小，请输入1到52之间的数");
    } else if (n > 52) {
      System.out.println("输入的抽取牌数过大，请输入1到52之间的数");
    }
  }

  public static void printCards(List<String> cards) {
    for (int i = 0; i < cards.size()-1; i++) {
      System.out.printf(cards.get(i) + " ");
    }
    System.out.println(cards.get(cards.size()-1));
  }
}
