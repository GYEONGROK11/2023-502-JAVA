package com.green.Day4.ch4;

import javax.swing.*;
import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {
      //scanner를 이용하여 성별을 입력 (남자, 남, man Man,여자 여 woman Woman)
        //남자면 잘생겼다 여자 예쁘다 아니면 누구냐
        Scanner gender = new Scanner(System.in);
        String input = gender.nextLine();
        String m = "잘생겼다";
        String w ="예쁘다";
        String h = "누구냐";
        if( "남자".equals(input)
                || "남".equals(input)
                ||"man".equals(input)
                ||"Man".equals(input) ) {
            System.out.printf("%s", m);
        } else if
        ("여자".equals(input)
                        || "여".equals(input)
                        || "woman".equals(input)
                        || "Woman".equals(input)) {
        }System.out.printf("%s",w);{

        }
    }
    }
