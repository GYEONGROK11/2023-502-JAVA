package com.green.day14.ch6;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.printAll();

        //Card c1 =cd.getCard();
        //Card c2 =cd.getCard();


        for (int i = 0; i < 52; i++) {
            System.out.println(i);
            Card c = cd.getCard();
            c.printMySelf();
        }
        System.out.println("----------");
        // cd.printAll(); - 널포인트익셉션에러 - getCard()를 하면서 주소값을 null로 바꿔서

    }
}
