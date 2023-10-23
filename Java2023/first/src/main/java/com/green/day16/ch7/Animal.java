package com.green.day16.ch7;



class AnimalTest {
    public static void main(String[] args) {
        //1. 부모타입은 자식 객체 주소값 담을 수 있다.
        Dog d1 = new Bulldog();
        Animal ani1 = d1;
        Bulldog b2 = (Bulldog) ani1;
        Animal ani2 = new Dog();
        Animal ani3 = new Cat();
        //2. 자식타입은 부모 객체 주소값 담을 수 없다.
        //Bulldog bull1 = new Dog();
        Dog d2 = new Dog();
        //Bulldog bull2 = (Bulldog)d2 ;
        Animal ani4 = d2;
        //3. 타입은(타입기준) 알고 있는 메소드만 호출할 수 있고
        Bulldog bull3 = new Bulldog();
        bull3.crying();
        bull3.jump();
        Dog d3 = new Bulldog();
        // d3.jump();  Dog타입은 jump 메소드가 없어서 호출안됨
        //4. 호출이 된다면 객체 기준이다.
        d3.crying();
        ani3.crying();
        //메소드 내용은 객체기준 : 불독이 왈왈
        //메소드 내용은 객체기준 : 냥냥
    }
}

class AnimalTest2 {
    public static void main(String[] args) {
        Animal ani = new Cat();
        System.out.println(ani instanceof Dog);  //false 형변환이 가능한지 묻는 instanceof
        System.out.println(ani instanceof Cat);  //true
        Cat cat1 = (Cat) ani;
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bulldog bulldog = new Bulldog();
        Animal A = new Animal();

        Animal ani2 = bulldog;
        System.out.println(ani2 instanceof Cat);
        //Cat cat2 = (Cat)ani2;

        callCrying(bulldog);  //다형성을 사용하는 이유 : 에니멀 타입으로 끝 - 메소드 하나로 호출가능
        callCrying(dog);
        callCrying(cat);
        callCrying(A);
    }

    private static void callCrying(Animal ani) { //다형성을 사용하는 이유 : 에니멀 타입으로 끝 - 메소드 하나로 호출가능
        ani.crying();
        if (ani instanceof Bulldog) { //ani(변수,상수 : 주소값)를 Bulldog(클래스이름)타입으로 형변환 가능한지 (상속관계)
            Bulldog bull = (Bulldog)ani;
            bull.jump();
        }
    }
}

public class Animal { //다형성 - 상속관계에서만 나타나는 형상 - 어떤 객체 주소값을 다른 타입이 저장할 수 있다
    {
        age = 12;
    }

    public Animal() {}
    protected int age;
    public void crying() {
        System.out.println("동물이 운다.");
    }
}

class Dog extends Animal {
    @Override
    public void crying() {
        System.out.println("멍! 멍!");
    }
}
class Bulldog extends Dog {
    @Override
    public void crying() {
        System.out.println("불독이 왈! 왈!");
    }
    public void jump() {
        System.out.println("불독 점프!");
    }
}

class Cat extends Animal {
    @Override
    public void crying() {
        System.out.println("냥! 냥!");
    }
}

