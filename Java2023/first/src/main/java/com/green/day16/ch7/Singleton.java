package com.green.day16.ch7;

public class Singleton {
    private Singleton(){
    }
    private static Singleton singleton;
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}


class SingletonTest{
    public static void main(String[] args) {
        //Singleton s1 = new Singleton();       //생성자에 private이 붙어서 객체 생성이 안됨
                                                //메소드를 이용하여 주소값을 넣음
        Singleton s1 = Singleton.getInstance(); //singleton에 주소값이 null이니 주소값 생성
        Singleton s2 = Singleton.getInstance(); //singleton에 주소값이 있으니 같은 주소값 생성
        System.out.println(s1==s2);             //그래서 s1 s2는 주소값이 같음

    }
}

