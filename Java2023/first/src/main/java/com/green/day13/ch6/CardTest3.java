package com.green.day13.ch6;

import java.util.Arrays;

import static com.green.day13.ch6.CardTest2.getNumverFromInt;
import static com.green.day13.ch6.CardTest2.makeCards;

class Card {
    public String patteun;//속성 "Spade", "Heart", "Diamond", "Club"
    public String denomination; //속성 A, 2~10, J, Q, K

    void printYourSelf() {
        System.out.printf("%s-%s\n", patteun, denomination);
    }


}

public class CardTest3 {
    public static void main(String[] args) {

        Card[] cards = CardTest3.makeCards1();

        for (Card c : cards) {
            c.printYourSelf();
        }

        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i].patteun + "-" + cards[i].denomination);
        }
    }

    public static Card[] makeCards2() {
        Card[] cArr = new Card[52];
        String[] kinds = {"Spade", "Heart", "Diamond", "Club"};

        for (int i = 0; i < cArr.length; i++) {
            String patteun = kinds[i / 13];
            String denomination = getNumverFromInt((i + 1) % 13);
            cArr[i] = new Card();
            Card c = cArr[i];
            cArr[i].patteun = patteun;
            cArr[i].denomination = denomination;
        }
        return cArr;
    }
    String getNumverFromInt1(int num) {
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

    public static Card[] makeCards1() {

        Card[] cArr = new Card[52];
        String[] strs = {"Spade", "Heart", "Diamond", "Club"};
        int crr = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                Card c = new Card();
                Card[] arr = new Card[cArr.length];

                c.patteun = strs[i];
                c.denomination = getNumverFromInt(j);
                cArr[crr++] = c;

            }
        }
        return cArr;
    }


}
