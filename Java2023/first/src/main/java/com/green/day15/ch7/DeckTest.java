package com.green.day15.ch7;

import javax.swing.text.AbstractDocument;

class Card {
    static final int KIND_MAX = 4; //카드무늬 수
    static final int NUM_MAX = 13; //무늬별 카드 수
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    /*public Card() {
        this(SPADE, 1);
    }*/

    public Card(int kind, int num) {
        this.kind = kind;
        number = num;
    }

    @Override
    public String toString() {
        //return "kind : " +kind +" number : " +number;
        return String.format("kind : %d number : %d", kind, number);
    }

}

class Deck {
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];

    public Deck() {
        int idx = 0;
        for (int i = 1; i <= Card.KIND_MAX; i++) {
            for (int z = 1; z <= Card.NUM_MAX; z++) {
                cardArr[idx++] = new Card(i, z);
            }
        }
        /*for (Card c : cardArr) {
            System.out.println(c);
        }*/
    }
    public Card pick(int idx){
        return cardArr[idx];
    }
    public Card pick(){
        return cardArr[(int)(Math.random()*CARD_NUM)];
    }

}

public class DeckTest {
    public static void main(String[] args) {
        /*Card c = new Card();
        System.out.printf("c.kind : %d, c.number : %d\n", c.kind, c.number);

        Card c2 = new Card(Card.HEART, 7);
        System.out.printf("c2.kind : %d, c2.number : %d\n", c2.kind, c2.number);

        String introduce = c2.toString();
        System.out.println(c2);
        System.out.println(c2.toString());
        System.out.println(introduce);*/
        Deck deck = new Deck();
        Card c1 = deck.pick(51);
        System.out.println(c1);
        Card c2 = deck.pick();
        System.out.println(c2);


    }
}
