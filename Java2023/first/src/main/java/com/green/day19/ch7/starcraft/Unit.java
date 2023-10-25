package com.green.day19.ch7.starcraft;

import java.util.*;


class StarcraftGame {
    public static void main(String[] args) {
        Unit unit = new Marine();
        unit.move(10, 20);

        Unit unit2 = new Tank();
        unit2.move(10, 20);

        //여러가지 주소값을 담고 싶을때 - 배열, ArrayList
        List<Unit> units = new ArrayList<>();
        units.add(unit);
        units.add(unit2);
        units.add(new Marine());
    }
}

class StarcraftGame2 {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Tank());
        units.add(new Tank());

        moveAll(units, 30, 50);

        Unit unit1 = units.get(units.size()-1);
        unit1.move(10,20);
        Tank tank = (Tank)unit1;
        tank.changeMode();

    }

    static void moveAll(List<Unit> list, int x, int y) {
        /*for (int i = 0; i < list.size(); i++) {
            list.get(i).move(x, y);
        }*/
        for (Unit unit:list ) {
            unit.move(x,y);
        }
    }
}

public abstract class Unit {
    protected int x;
    protected int y;

    public abstract void move(int x, int y); //추상메소드는 static이 붙을수 없다 - 구현부가 없어서 오버라이딩 해야되기 때문

    public void stop() {
        System.out.println("정지");
    }
}

class Marine extends Unit {
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("마린이 좌표 x : %d, y : %d로 이동\n", x, y);
    }

    public void steamPack() {

        System.out.println("스팀팩!");
    }
}

class Tank extends Unit {
    private boolean siegeMode;

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("탱크가 좌표 x : %d, y : %d로 이동\n", x, y);
    }

    public void changeMode() {
        siegeMode = !siegeMode; //토글
        System.out.println(siegeMode ? "시즈모드가 되었습니다" : "시즈모드가 해제되었습니다");
    }
}
