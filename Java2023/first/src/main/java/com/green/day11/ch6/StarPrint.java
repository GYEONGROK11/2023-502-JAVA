package com.green.day11.ch6;

public class StarPrint {

    void line(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void square(int num) {
        for (int i = 0; i < num; i++) {
            for (int z = 0; z < num; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void square1(int num) {
        for (int i = 0; i < num; i++) {
            line(num);
        }
    }

    void triangle(int num) {
        for (int i = 1; i <= num; i++) {
            line(i);
        }
    }

    String chkGenderById(String id) {
        char ch = id.charAt(7);
        switch (ch) {
            case '1', '3':
                return "남자";
            case '2', '4':
                return "여자";
        }
        return "유효하지않음";
    }

    int sumFromTo(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
       return sum;
    }
}

