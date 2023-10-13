package com.green.day12.ch6;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Spade";
        c1.number = "A";

        Card c2 = new Card();
        c2.kind = "Heart";
        c2.number = "10";

        System.out.println(c1==c2);
        System.out.println("c1.kind : "+c1.kind);
        System.out.println("c2.kind : "+c2.kind);

        System.out.println(c1.getScore());
        System.out.println(c2.getScore());

    }

}
