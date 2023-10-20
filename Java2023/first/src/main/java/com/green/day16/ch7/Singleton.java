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
    public static void main(String[] args) {//싱글톤 - 객체생성을 두개이상 하지않겠다 - 객체 하나로 돌려씀
        //Singleton s1 = new Singleton();       //생성자에 private이 붙어서 객체 생성이 안됨 - 내부에서만 객체생성이 가능함
                                                //메소드를 이용하여 주소값을 넣음
        Singleton s1 = Singleton.getInstance(); //singleton에 주소값이 null이니 주소값 생성
        Singleton s2 = Singleton.getInstance(); //singleton에 주소값이 있으니 같은 주소값 생성
        System.out.println(s1==s2);             //그래서 s1 s2는 주소값이 같음

    }
}

