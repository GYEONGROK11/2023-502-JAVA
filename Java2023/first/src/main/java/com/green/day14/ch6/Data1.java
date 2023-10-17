package com.green.day14.ch6;

public class Data1 {
    int value;
    int value2;
    int value3;

    //기본생성자 = 객체화 할때 무조건 필요함 - 그래서 자동생성
    public Data1() {  // 객체화 하면 생성자가 없을때 자동 생성 - 기본 생성자 (파라미터가 없는 생성자)
        /*value = 100;
        value2 = 200;
        value3 = 300;*/
        // this.   주소값 호출
        this(100,200,300); //생성자 호출
    }

    public Data1(int a) { //파라미터가 있는 생성자
        value = a;
    }

    public Data1(int a, int b, int c) { //파라미터가 있는 생성자
        value = a;
        value2 = b;
        value3 = c;
    }

    public void printMySelf() {
        System.out.printf("value : %d, value2 : %d, value3 : %d\n", value, value2, value3);
    }

}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 data = new Data1();
        data.printMySelf();
        /*
        data.value = 100;
        data.value2 = 200;
        data.value3 = 300;
         */
        Data1 data1 = new Data1(10, 20, 30);
        data1.printMySelf();


    }
}
