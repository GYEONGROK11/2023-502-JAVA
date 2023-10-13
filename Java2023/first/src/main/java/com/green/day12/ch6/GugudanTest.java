package com.green.day12.ch6;

public class GugudanTest {
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        gugudan.print(4); //4단 출력
        gugudan.print(7);

        gugudan.printFromTo(3,4);
        gugudan.printFromTo(5,7);

        gugudan.printFromTo(3,6,"----");
    }
}
