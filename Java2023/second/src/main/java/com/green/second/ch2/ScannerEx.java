package com.green.second.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner는 기본생성자가 없음
        System.out.print("값 입력 >>");
        String val = scan.nextLine();

        //int intVal = Integer.parseInt(val);
        int intVal2 = MyUtils.parseStringToInt(val);
        System.out.println("val : " + intVal2);
    }
}

class MyUtils {
    public static int parseStringToInt(String val) {
        try {
            return Integer.parseInt(val);
        } catch (Exception e) { }
        return -1;
    }

}