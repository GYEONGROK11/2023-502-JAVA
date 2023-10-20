package com.green.day17.ch7;

import javax.crypto.spec.PSource;

public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
        Product2 p = new Product2("제품명", 1000);
        System.out.println(p);


    }
}

class PolyArgumentTestVer2_2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        System.out.println(tv);
        Computer2 com = new Computer2();
        System.out.println(com);
        Audio2 audio = new Audio2();
        System.out.println(audio);
    }
}

class Audio2 extends Product2 {
    public Audio2() {
        super("Audio", 500);
    }
}

class Tv2 extends Product2 {
    public Tv2() {
        super("Tv", 100);
    }
}

class Computer2 extends Product2 {
    public Computer2() {
        super("Computer", 200);
    }
}

class Product2 {
    private String name;
    private int price;
    private int bonusPoint;
    public Product2(){}
    public Product2(String name, int price) {
        this.name = name;
        this.price = price;
        this.bonusPoint = price / 10;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public String toString() {
        return String.format("%s - price : %d, Point : %d", name, price, bonusPoint);
    }
}

class PolyArgumentTestVer2_3 {
    public static void main(String[] args) {
        Buyer2 buyer = new Buyer2();
        buyer.buy(new Tv2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Tv2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());

        buyer.summary();
    }
}

class Buyer2 {
    private int money;
    private int bonusPoint;
    private int cnt;
    private int sum;
    private Product2[] productArr;

    public void buy(Product2 product2) {
        if (cnt == productArr.length) {
            System.out.println("그만사");
            return;
        }
        if (money < product2.getPrice()) {
            System.out.println("잔액부족");
            return;
        }
            productArr[cnt++] = product2;
            this.money -= product2.getPrice();
            this.bonusPoint += product2.getBonusPoint();
            sum += product2.getPrice();
            System.out.printf("%s를 구매하셨습니다 money : %d, point: %d\n", product2.getName(), money, bonusPoint);
    }
    public void summary(){

        System.out.printf("총 %d만원 사용하였습니다",sum);
    }
    public Buyer2() {
        this.money = 2000;
        this.bonusPoint = 0;
        productArr = new Product2[10];
    }


}