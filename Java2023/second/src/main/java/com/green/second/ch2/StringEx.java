package com.green.second.ch2;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        // 주소값 + 주소값  -> 새로운 스트링 객체 생성
        System.out.println(name);

        String title1 = "12" + 10 + 9;
        System.out.println(title1);

        String title2 = "12" + (10 + 9);
        System.out.println(title2);

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));  //String은 이퀄스가 오버라이딩 되어있음

        Numbox b1 = new Numbox(10);
        Numbox b2 = new Numbox(10);
        //동일성 (==): 주소값 비교    동등성 (.equals()): 가지고 있는 값 비교

        System.out.println(b1.getNum() == b2.getNum());


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2); //주소값이 다른 객체   == : 동일성 비교   false
        System.out.println(b1.equals(b2)); //같은 값의 다른 객체  .equals() : 동등성 비교     false
        System.out.println(b1.equals(str1));
        System.out.println(b1.equals(null));

    }
}

class Numbox {
    private int num;

    public Numbox(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public boolean equals(Object obj) { //
        if (!(obj instanceof Numbox)) {
            return false;
        }

        Numbox nb = (Numbox) obj;
        return num == nb.getNum();

    }

    @Override
    public String toString() {
        return String.format("%d", num);
    }

}