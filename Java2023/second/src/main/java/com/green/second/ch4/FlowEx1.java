package com.green.second.ch4;

import java.util.Scanner;

public class FlowEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요>>");
        String str = scan.nextLine();

        try {
            int num = Integer.parseInt(str);
            System.out.printf("%d(은)는 %s수입니다", num, num % 2 == 0 ? "짝" : "홀");
        }catch (Exception e){
            System.out.printf("잘못된값");
        }


    }
}
