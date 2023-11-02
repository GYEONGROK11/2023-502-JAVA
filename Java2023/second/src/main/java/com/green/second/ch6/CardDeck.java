package com.green.second.ch6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardDeck {
    //카드 객체 주소값 여러개 저장
    private List<Card> cardList;

    public List<Card> getCardList() {
        return cardList;
    }

    public CardDeck() {
        cardList = new ArrayList();
        String[] strs = {"Spade", "Heart", "Clova", "Diamond"};
        final int NUM = 13;
        for (int i = 0; i < strs.length; i++) {
            for (int j = 1; j <= NUM; j++) {
                String str = getDenomination(j);
                Card c = new Card(strs[i], str);
                cardList.add(c);
            }
        }
    }

    private String getDenomination(int val){
        switch (val){
            case 1 : return "A";
            case 11 : return "J";
            case 12 : return "Q";
            case 13 : return "K";
        }
        return String.valueOf(val);
    }

}

class CardDeckTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        for (Card c: cd.getCardList() ) {
            System.out.println(c);
        }
    }
}