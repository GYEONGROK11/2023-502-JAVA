package com.green.day14.ch6;

public class Car2 {
    String color;
    String gearType; //auto(자동),manual(수동)
    int door; //문의 개수

    public Car2() {

    }

    public Car2(Car2 c1) {
        color = c1.color;
        gearType = c1.gearType;
        door = c1.door;
    }

    public void printMySelf () {
        System.out.printf("color : %s, gearType : %s, door : %d\n", color, gearType, door);
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "black";
        c1.gearType = "manual";
        c1.door = 5;

        Car2 c2 = new Car2(c1);


        c1.printMySelf();
        c2.printMySelf();
    }
}
