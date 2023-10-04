package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission {
    public static void main(String[] args) {
        //남자의 평균키는 170 여자는 157
        //Scanner 이용 성별을 입력 받음 (남자, 여자)
        // 키 입력
        //평균키 미만이면 "156cm는 남자 평균 이하입니다."
        //평균키랑 같다면 "170cm는 남자 평균 입니다."
        //평균키 초과면 "171cm는 남자 평균 초과입니다."
        //평균키 미만이면 "146cm는 여자 평균 이하입니다."
        //평균키랑 같다면 "157cm는 여자 평균 입니다."
        //평균키 초과면 "170cm는 여자 평균 초과입니다."
        Scanner scan = new Scanner(System.in);

        System.out.print("성별을 입력하세요 >>");
        String gender = scan.nextLine();

        System.out.print("키를 입력하세요 >>");
        int height = scan.nextInt();

        if ("남자".equals(gender)) {

            if (height > 170) {
                System.out.printf("%dcm는 %s 평균 초과입니다\n",height,gender);
            } else if (height < 170) {
                System.out.printf("%dcm는 %s 평균 미만입니다\n",height,gender);
            } else {
                System.out.printf("%dcm는 %s 평균 입니다\n",height,gender);
            }
        } else if ("여자".equals(gender)) {

            if (height > 157) {
                System.out.printf("%dcm는 %s 평균 초과입니다\n",height,gender);
            } else if (height < 157) {
                System.out.printf("%dcm는 %s 평균 미만입니다\n",height,gender);
            } else {
                System.out.printf("%dcm는 %s 평균 입니다\n",height,gender);
            }
    }
}
}
