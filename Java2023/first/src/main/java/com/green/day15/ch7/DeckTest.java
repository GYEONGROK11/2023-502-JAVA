package com.green.day15.ch7;

import javax.swing.text.AbstractDocument;

class Card {
    static final int KIND_MAX = 4; //카드무늬 수
    static final int NUM_MAX = 13; //무늬별 카드 수
    static final int SPADE = 4;
    static final int DIAMOND = 3;//스태틱 : 바로 메모리에 올라가서 객체화 할 필요없음 - 공간은 하나임 ,같은 클래스에서 바로사용가능 클래스 명.으로 접근가능
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    public Card() {
        this(SPADE, 1);
    }

    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
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
        int rIdx = (int)(Math.random()*CARD_NUM);
        //return cardArr[rIdx];
        return pick(rIdx);

    }
    void shuffle(){
        for (int i = 0; i < CARD_NUM; i++) {
            int rIdx = (int)(Math.random()*CARD_NUM);
            Card tmp =cardArr[i];  //Card의 주소값을 담아야됨
            cardArr[i]=cardArr[rIdx];
            cardArr[rIdx]=tmp;
        }
        for (Card c : cardArr) {
            System.out.println(c);
        }
    }
}

public class DeckTest {
    public static void main(String[] args) {
        Card c = new Card();
        Deck deck = new Deck();
        deck.shuffle();

        /*System.out.printf("c.kind : %d, c.number : %d\n", c.kind, c.number);

        Card c2 = new Card(Card.HEART, 7);
        System.out.printf("c2.kind : %d, c2.number : %d\n", c2.kind, c2.number);

        String introduce = c2.toString();
        System.out.println(c2);
        System.out.println(c2.toString());
        System.out.println(introduce);
        Card c3 = deck.pick(51);
        System.out.println(c3);
        Card c4 = deck.pick();
        System.out.println(c4);*/

    }
}
