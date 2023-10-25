package com.green.day19.ch7;

public interface PlayingCard {// 인터페이스 - 추상메소드 밖에 없는 클래스 객체화안됨 (부모역할만 하겠다)
    public static final int SPADE=4;    //인터페이스에는 멤버변수에 public static final 생략됨
    final int DIAMOND=3;                //                      오픈   정적    상수   - 멤버필드는 잘안씀
    static int HEART=2;
    int CLOVER=1;

    public abstract String getCardNumber();  //메소드에는 추상메소드 밖에 없기 때문에 public abstract 생략됨
    String getCardKind();

}

interface PlayingChess extends PlayingCard {//인터페이스 끼리 상속 받을때 extends
    void moveHorse(int x, int y);
}
class Chess implements PlayingChess{
    @Override
    public String getCardNumber() {
        return null;
    }
    @Override
    public String getCardKind() {
        return null;
    }
    @Override
    public void moveHorse(int x, int y) {
    }
}

class Card implements PlayingCard{  //인터페이스를 상속 받을때 implements
    @Override
    public String getCardNumber() {
        return null;
    }
    @Override
    public String getCardKind() {
        return null;
    }
}

class PlayingCardTest{
    public static void main(String[] args) {
        System.out.println(PlayingChess.SPADE);
        System.out.println(PlayingCard.CLOVER);
    }
}
