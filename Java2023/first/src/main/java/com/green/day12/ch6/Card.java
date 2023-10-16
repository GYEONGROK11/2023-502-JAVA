package com.green.day12.ch6;

public class Card {
    public String kind;//속성
    public String number; //속성

    public void printYourSelf(){
        System.out.printf("%s (%s)\n",kind,number);

    }//메소드
    public int getScore() {

        switch (number) {
            case "A":
                return 1;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;

        } return Integer.parseInt(number);

    }//메소드
}
