package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String []args ) {
        int score = 0;
        System.out.print("점수를 입력하세요");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt(); //학점 - 문자 (String) score - 숫자 (int) 도출되어야 할 결과값 기준점부터 만들어주기

        //score값이 90점 보다 같거나 크면 A학점 추력
        //score값이 80점보다 같거나 크면 B학점 출력
        //1의 자리수가 8이상이면 +, 3이하면 -, 나머지는 없음(빈칸)
        //나머지 C학점출력
        //예를들어 92점>A- 98점 >A+

        String grade= "c";//String은 %S
        if(score >=90){
            if(score>=98){
                grade="A+";
            } else if (score>=93) {
                grade="A";
            }else{
                grade="A-";
            }
        }else if(score>=80){
            if(score>=88){
                grade="B+";
            } else if (score>=83) {
                grade="B";
            }else{
                grade="B-";
            }
        }else{
            grade="c";
        }
        System.out.printf("%s학점" , grade);






    }
}
