package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5_2 {
    public static void main(String []args ) {
        int score = 0;
        System.out.print("점수를 입력하세요");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();


        String grade= "c";//String은 %S
        String opt = "";
        if(score >=90){
            grade="A";
            if(score>=98){
                opt = "+";
            } else if (score<=93) {
                opt="-";
              }
        }else if(score>=80){
            grade="B";
            if(score>=88){
                opt="+";
            } else if (score<=83) {
               opt="-";
            }
        }else{
            grade="c";
        }
        System.out.printf("%s%s학점" , grade, opt);






    }
}
