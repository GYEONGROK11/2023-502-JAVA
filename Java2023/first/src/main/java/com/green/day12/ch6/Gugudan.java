package com.green.day12.ch6;

public class Gugudan {


    void print(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = % d\n", dan, i, dan * i);
        }
    }

    void printFromTo(int dan1, int dan2) {
        for (int i = dan1; i <= dan2; i++) {
            print(i);
        }
    }
  //오버로딩 : 같은이름사용가능 - 파라미터가 다르면 타입에 따라 찾아들어감
    void printFromTo(int dan1, int dan2, String s) {
        for (int i = dan1; i <= dan2; i++) {
            print(i);
            System.out.println(s);
        }
    }
}
