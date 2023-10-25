package com.green.day19.ch7.starcraft2;


public interface Fighterble extends Movable, Attackble { //interface는 구현부가 없기 때문에 다중상속이 가능
}

interface Movable {
    void move(int x, int y);
}

interface Attackble {
    void attack(Unit U);
}

class Unit {
    private int currentHp;
    private int x;
    private int y;
}

class Fighter extends Unit implements Fighterble {
    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit U) {

    }
}

class FighterTest {
    public static void main(String[] args) {
        Movable movable = new Fighter();
        movable.move(10, 20);
        Fighter fighter = (Fighter) movable;
        fighter.attack(null);
        Attackble attackble = (Attackble) movable;
        attackble.attack(null);

    }
}