package com.green.day18.ch7;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        NumberBaseball nbb = new NumberBaseball(3);
        nbb.start();
        System.out.println(Arrays.toString(nbb.getGAME_NUMVERS()));
    }
}

class NumberBaseball {
    private final int GAME_COUNT;
    private final int[] GAME_NUMVERS;  //배열[]에 상수는 주소값을 못 바꿈

    public int[] getGAME_NUMVERS() {
        return GAME_NUMVERS;
    }

    public NumberBaseball(int count) {
        GAME_COUNT = count;
        GAME_NUMVERS = new int[count];
    }

    private void setRandomNumNotDuplicate() {
        for (int i = 0; i < GAME_COUNT; i++) {
            int rVal = (int) (Math.random() * 10);
            GAME_NUMVERS[i] = rVal;
            for (int j = 0; j < i; j++) {
                if (GAME_NUMVERS[i] == GAME_NUMVERS[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    private boolean isContinueCheckResult(int[] arr) {
        int strike = 0, ball = 0, out;
        for (int i = 0; i < GAME_NUMVERS.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (GAME_NUMVERS[i] == arr[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        out = GAME_COUNT - (strike + ball);
        return false;
    }

    private void getUserInput() {
        Scanner scan = new Scanner(System.in);
        int[] userArr = new int[GAME_COUNT];
        for (int i = 0; i < GAME_COUNT; i++) {
            System.out.printf("%d 숫자>>", i + 1);
            userArr[i] = scan.nextInt();
        }
        boolean r = isContinueCheckResult(userArr);

        scan.close();
    }

    public void start() {
        setRandomNumNotDuplicate();
        getUserInput();
    }
}