package com.green.day19.ch7;

public class AnonymousClassTest {
    public static void main(String[] args) {
        Runnable2 run = new RunRobotImpl();
        run.run();
        Runnable2 run2 = new Runnable2() {//익명클래스 이벤트성 1회성 - 클래스를 생성하지않고 바로 구현
            @Override
            public void run() {
                System.out.println("하하");
            }
        };

        run2.run();

        BasicRobot br = new BasicRobot() {
            public void run(){
                System.out.println("익명로봇 뛴다");
            }    //추상클래스도 익명클래스 가능 - 클래스명이 있기 때문에 잘안씀
        };

        br.run();
    }

}


interface Runnable2 {
    public abstract void run();
}

class BasicRobot {
    public void run() {
        System.out.println("로봇뛰기");
    }
}

class RunRobotImpl implements Runnable2 {  //클래스명 뒤에  Impl을 붙이기도 함
    @Override
    public void run() {
        System.out.println("로봇이 달린다");
    }
}