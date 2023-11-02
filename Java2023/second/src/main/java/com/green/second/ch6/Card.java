package com.green.second.ch6;

public class Card {
    private String pattern;
    private String denomination;


    // 리턴타입 x, 이름이 클래스 명과 같음
    public Card(String pattern,String denomination){
        this.pattern = pattern;
        this.denomination=denomination;
    }

    @Override
    public String toString(){
        return String.format("%s(%s)",pattern,denomination);
    }



}

