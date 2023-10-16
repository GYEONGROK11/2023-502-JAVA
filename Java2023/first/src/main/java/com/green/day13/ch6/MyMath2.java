package com.green.day13.ch6;

public class MyMath2 {
    int num;

    static int staticNum; //static 다른 메모리 영역에 저장, 공간이 하나

    static void staticAbs(int n){ //파라미터만 사용한다면 인스턴스 변수를 사용하지 않으므로 static을 붙여 속도를 빠르게 함
        System.out.println(n<0? n:-n);
    }
    void staticAbs1(){ //인스턴스 변수를 사용하므로 static을 붙일 수 없다
        System.out.println(num<0? num:-num);
    }


    static void print(){//static 메서드에는 인스턴스 변수를 사용할수없다   //스태틱 메소드는 가장먼저 올라가기 때문에
        //print2();  static메소드에 인스턴스 메소드 호출x
        System.out.printf("staticNum : %d, num : %d\n",staticNum);
    }

    void print2(){//인스턴스 메소드에는 static 변수 사용가능
        print();//인스턴스 메소드에 static메소드 호출가능
        System.out.printf("staticNum : %d, num : %d\n",staticNum,num);

    }

}
