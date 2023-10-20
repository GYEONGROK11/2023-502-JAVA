package com.green.day17.ch7;

public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
        Product2 p = new Product2("제품명",1000);
        System.out.println(p);


    }
}

class Product2{
    private String name;
    private int price;
    private int bonusPoint;

    public Product2(String name, int price){
        this.name = name;
        this.price = price;
        bonusPoint = price/10;
    }
    @Override
    public String toString() {
        return String.format("%s - price : %d, Point : %d",name, price, bonusPoint);
    }
}