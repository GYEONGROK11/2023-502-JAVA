package com.green.day6.ch4;

public class While {
    public static void main(String[] args) {
      //While은 반복문입니다.  for 문은 반복횟수를 알때 사용,  while문은 반복은 하되 언제 멈춰야 하는지 알때 사용   멈추는 답을 알때

        // do while은 조건을 체크하기전에 일단 한번 실행 후 조건 체크
        /*

         */

        for(int i =0; i<10;i++) {
            System.out.println("for-" + i);
        }
        System.out.println("------------");

        int i =0;
            while (i<10){
                System.out.println("while-"+i);
                i++;
        }
    }
}
