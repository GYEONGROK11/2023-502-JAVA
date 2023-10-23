package com.green.day17.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Product p2 = new Product(100);
        System.out.println(p2);
        Tv tv = new Tv();
        System.out.println(tv);
        //price는 100저장 보너스에는 10
        Computer computer = new Computer();
        System.out.println(computer);
        computer.setPrice(100);
        computer.setBonusPoint(100);
        int price = computer.getPrice();
        int bonusPoint = computer.getBonusPoint();
        System.out.println(price);
        System.out.println(bonusPoint);
    }
}

class Product {
    private int price;
    private int bonusPoint;

    protected Product(int price) {
        this.price = price;
        bonusPoint = (int) (price * 0.1);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBonusPoint(int price) {
        this.bonusPoint = price / 10;
    }

    public int getPrice() {
        return this.price;
    }

    public int getBonusPoint() {
        return this.bonusPoint;
    }

    @Override
    public String toString() {
        return String.format("price : %d, bonusPoint : %d", price, bonusPoint);
    }
}

class Tv extends Product {
    public Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    public Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer"; //+ super.toString();
    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        System.out.println(buyer); //1000 ,0
        buyer.buy(new Tv()); //100
        buyer.buy(new Tv());
        buyer.buy(new Computer()); //200
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        System.out.println(buyer);

        //머니부족 "잔액부족 머니값 마이너스 처리 x
        //머니충족 Tv를 구입하였습니다 머니 - 포인트 +
    }
}

class Buyer {
    private int money;
    private int bonusPoint;

    public void buy2(Product product) {
        System.out.printf("제품명 : %s ", product);
        System.out.printf("price : %d ", product.getPrice());
        System.out.printf("point : %d\n", product.getBonusPoint());
    }

    public void buy(Product product) {
        if (money < product.getPrice()) {
            System.out.println("잔액부족");
            return;
        }
        this.money -= product.getPrice();
        this.bonusPoint += product.getBonusPoint();
        System.out.printf("%s을/를 구매하셨습니다\t ", product);
        System.out.printf("money : %d point : %d\n ", money, bonusPoint);
    }

    Buyer() {
        this.money = 1050;
        this.bonusPoint = 0;
    }

    @Override
    public String toString() {
        return String.format("money : %d, bonusPoint : %d\n", money, bonusPoint);
    }
}
