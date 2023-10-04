package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission {
    public static void main(String[] args) {
        //남자의 평균키 170 , 여자의 평균키 157
        //scanner 이용하여 성별 입력 (남 ,여)
        //키를 입력받습니다
        //평균키 이하면 "156cm는 남평균 이하입니다."
        //평균키랑 같다면 "당신은 170는 평균입니다."
        //평균키 초과면 "170cm는 남자 평균 초과입니다."
        //평균키 미만이면 "146cm는 여자 평균 미만입니다."
        //평균키랑 같다면 "157cm는 여자평균입니다."
        //평균키 초과면"170cm는 여자 평균 초과입니다."
        Scanner scan = new Scanner(System.in);

        System.out.println("성별을 입력해주세요(남자,여자)>>");
        String gender = scan.nextLine();
        System.out.print("키를 입력해 주세요>>");
        int height = scan.nextInt();

        if ("남자".equals(gender)) {//남자 170
            if (height > 170) {
                System.out.printf("%dcm는 남자 평균 초과입니다.", height);
            } else if (height < 170) {
                System.out.printf("%dcm는 남자 평균 미만입니다.", height);
            } else {
                System.out.printf("%dcm는 남자 평균입니다", height);
            }
        }else if ("여자".equals(gender)) {//남자 170
            if (height > 157) {
                System.out.printf("%dcm는 여자 평균 초과입니다.", height);
            } else if (height < 157) {
                System.out.printf("%dcm는 여자 평균 미만입니다.", height);
            } else {
                System.out.printf("%dcm는 여자 평균입니다", height);
            }
        }
    }
}