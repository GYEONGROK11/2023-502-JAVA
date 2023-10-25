package com.green.day17.ch7;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
    private int sum2;
    private Product2[] productArr;

    public void buy(Product2 product2) {
        if(product2 == null){
            System.out.println("잘못 구매하셨습니다");
            return;
        }
        if (cnt == productArr.length) {
            System.out.println("구매허용갯수 초과");
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
        this.money = 3500;
        this.bonusPoint = 0;
        productArr = new Product2[10];
    }


}

class PolyArgumentTestVer2_4 {
    public static void main(String[] args) {
        Buyer3 buyer = new Buyer3();
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Audio2());
        buyer.buy(new Tv2());
        buyer.summary();
    }
}
class Buyer3 {
    //money(정수) 저장 가능
    //bonusPoint(정수) 저장 가능
    //Product2 객체의 주소값 여러개 저장 가능
    private int money;
    private int bonusPoint;
    private Product2[] productArr;
    private int i;
    private Map<String, Integer> buyItems;

    public Buyer3() {
        buyItems = new HashMap();
        this.money = 3500;
        this.bonusPoint = 0;
        productArr = new Product2[10];
    }

    public void buy(Product2 p) {
        if(p == null) {
            System.out.println("잘못 구매하셨습니다.");
            return;
        }
        if(i == productArr.length) {
            System.out.println("담을 수 있는 공간이 없습니다.");
            return;
        }
        if(money < p.getPrice()) {
            System.out.println("금액이 부족합니다.");
            return;
        }

        productArr[i++] = p;
        money -= p.getPrice();
        bonusPoint += p.getBonusPoint();

        String productName = p.getName();
        if(buyItems.containsKey(productName)) {
            buyItems.put(productName
                    , buyItems.get(productName) + 1);
        } else {
            buyItems.put(productName, 1);
        }
        System.out.printf("%s을(를) 구매하였습니다.\n"
                , productName);
    }

    public void summary() {
        int sum = 0;
        for(Product2 p : productArr) {
            if(p == null) { break; }
            sum += p.getPrice();
        }
        System.out.printf("총 구매금액: %,d, 남은금액: %,d, 보너스 포인트: %,d\n"
                , sum, money, bonusPoint);

        Set<String> namesSet = buyItems.keySet();
        Iterator<String> iterator = namesSet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            int cnt = buyItems.get(key);
            System.out.printf(" %s: %d대", key, cnt);
        }
        System.out.println("를 구매하였습니다.");
    }


}