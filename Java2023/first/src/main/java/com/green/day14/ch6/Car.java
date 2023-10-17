package com.green.day14.ch6;


public class Car {
    String color;
    String gearType; //auto(자동),manual(수동)
    int door; //문의 개수

    public Car(){
        this("white");
    }
    public Car(String color){
        this(color,"auto",4);
    }
    public Car(String color,String gearType,int door){
        this.color = color;
        this.gearType = gearType;
        this.door =door;
    }
    public void printMySelf(){
        System.out.printf("color : %s, gearType : %s, door : %d\n",color,gearType,door);
    }
}

class CarTest{
    public static void main(String[] args) {
        Car car1 =new Car();
        Car car2 =new Car("blue");

        car1.printMySelf(); //color 화이트 g 오토 d 4
        car2.printMySelf(); //color 블루 g 오토 d 4


    }
}
