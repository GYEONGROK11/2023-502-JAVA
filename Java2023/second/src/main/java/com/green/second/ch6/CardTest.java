package com.green.second.ch6;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card("Spade","A"); //생성자 - 객체생성할 때 한번 실행
        System.out.println(c1);
        Card c2 = new Card("Heart","K");
        System.out.println(c2);
    }
}
