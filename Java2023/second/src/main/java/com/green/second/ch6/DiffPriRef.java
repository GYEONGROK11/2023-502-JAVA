package com.green.second.ch6;

public class DiffPriRef {
    public void changeVal(int num) { //A
        num = 10;
    }

    public void changeVal(NumBox nb) { //B
        nb.num = 10;
        nb = new NumBox();
        nb.num=20;
    }

    public static void main(String[] args) {
        int num = 1;
        //A호출 하면서 num 값을 전달
        DiffPriRef dpr = new DiffPriRef();
        dpr.changeVal(num);
        System.out.printf("num : %d\n", num); // 1
        System.out.println("------------------");

        NumBox nb = new NumBox();
        nb.num = 1;
        dpr.changeVal(nb);
        System.out.printf("nb.num : %d", nb.num); // 10
    }
}


class DiffPriRef2 {
    public static void changeVal(int num) { //A
        num = 10;
    }

    public static void changeVal(NumBox nb) { //B
        nb.num = 10;
    }

    public static void main(String[] args) {
        int num = 1;
        //A호출 하면서 NUM 값을 전달
        changeVal(num);

    }
}

class NumBox {
    int num;

}