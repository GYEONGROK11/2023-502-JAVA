package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission2 {
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
        System.out.print("성별(남자/여자)을 입력해주세요 : ");
        String gender = scan.nextLine();
        System.out.print("키를 입력해주세요 : ");
        int height = scan.nextInt();
        String d = "평균";

        if ("남자".equals(gender)) {   //"남자".equals(S) 가 실행하기에 안전. 리터럴이 앞쪽으로.
            if (height < 170) {
                d += " 미만";
            } else if (height > 170) {
                d += " 초과";
            }
        } else {
            if (height < 157) {
                d += " 미만";
            } else if (height > 157) {
                d += " 초과";
            }
        }
        System.out.printf("%s키 %dcm는 %s %s입니다.",gender,height,gender,d);
}
}
