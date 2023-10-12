package com.green.day11.ch6;

public class DiffPriRef {//기본형과 참조형의 차이점
    public static void main(String[] args) {
        int num = 30;
        changeVal(num);
        System.out.println("num : "+num);

        NumBox nb = new NumBox();
        System.out.println("(1)nb.num : "+nb.num);
        nb.num = 30;
        System.out.println("(2)nb.num : "+nb.num);
        changeVal(nb);
        System.out.println("(3)nb.num : "+nb.num);

    }

    public static void changeVal(int num){
        System.out.println("changeVal - int");
        num = 10;
    }
    public static void changeVal(NumBox nb2){
        System.out.println("changeVal - NumBox");
        nb2.num = 10;

    }

}

class NumBox{
    int num;
}
