package com.green.day16.ch7;

public class Animal {
    public void crying() {
        System.out.println("동물이 운다.");
    }
}

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
        //3. 타입은 알고 있는 메소드만 호출할 수 있고
        Bulldog bull3 = new Bulldog();
        bull3.crying();
        bull3.jump();
        Dog d3 = new Bulldog();
        // d3.jump();  Dog타입은 jump 메소드가 없어서 호출안됨
        //4. 호출이 된다면 객체 기준이다.
        d3.crying();
        ani3.crying();
        //메소드 내용은 객체기준 : 불독이 왈왈
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

        callCrying(bulldog);
        callCrying(dog);
        callCrying(cat);
        callCrying(A);
    }

    private static void callCrying(Animal ani) {
        ani.crying();
        if (ani instanceof Bulldog) {
            Bulldog bull = (Bulldog)ani;
            bull.jump();
        }
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

