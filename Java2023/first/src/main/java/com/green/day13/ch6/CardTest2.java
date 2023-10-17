package com.green.day13.ch6;

import com.green.day12.ch6.Card;

import java.util.Arrays;

public class CardTest2 {
    public static void main(String[] args) {
        //Card c = new Card();
        Card[] cards = makeCards();  //객체화를 안했기 때문에 스태틱 메소드라는것을 알수있음

        System.out.println(cards.length);

        for (Card c: cards) {  //c는 Card 타입이므로
            c.printYourSelf();
        }
    }

    public static String getNumverFromInt(int num) {
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";

        }
        return String.valueOf(num);
                //Integer.toString(num);
    }

    public static Card[] makeCards() {
        Card[] cards = new Card[52];
        //Spade, Heart, Diamond, Club
        //A, 2~10, J, Q, K
        String[] kinds = {"Spade", "Heart", "Diamond", "Club"};
        int cnt =0;
        for (int i = 0; i < kinds.length; i++) {
            for (int j = 1; j <= 13; j++) {
                Card c = new Card();
                String number = getNumverFromInt(j);//
                c.kind = kinds[i];
                c.number = number;
                cards[cnt++] = c;
            }
        }
        return cards;
    }
}

