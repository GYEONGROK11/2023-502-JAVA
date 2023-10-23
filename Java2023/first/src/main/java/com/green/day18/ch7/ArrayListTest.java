package com.green.day18.ch7;

import com.green.day14.ch6.Card;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList(); // List 가오브젝트타입으로 바뀜
        list.add(10);           //순차적으로 배열에 들어감
        list.add(10.3d);
        list.add("dd");
        list.add(new Card());
        Object val1 = list.get(0); //사용할때 타입 확인 해야됨 - 형변환
        int intVal = (int)val1;   //형변환
        float floatVal = (float)list.get(1);  //  불편해서 이런식으로 사용하지 않음


        Object obj = 10;  // 오브젝트 타입엔 모든것을 담을수 있다
        obj = 10.3f;
        obj = 10.3d;
        obj = 100l;
        obj = "asd";
        obj = new Card();  //사용할때 타입 확인 해야됨
    }
}

class ArrayListTest2{
    public static void main(String[] args) {
        int v1 = 10;
        Integer v2 =10;  //래퍼타입 - 메소드를 가지고 있음
        System.out.println(v1==v2);
        List<Integer> list = new ArrayList(); //타입을 정해서
        list.add(10);
        //list.add(10.3f);                    //안들어감
        //list.add("ddasd");
        int val1 = list.get(0);  //타입을 맞춰서 형변환 안해도됨
       // System.out.println(list.get(1));  방이 0번방 1개임
        list.add(21);           //추가할때마다 방이 추가됨
        System.out.println(list.get(1));
        list.add(32);
        list.add(44);
        list.add(56);
        System.out.println("size : " + list.size()); //방의 크기(길이)

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("[%d] : %d\n",i,list.get(i));
        }
        for (int val: list  ) {
            System.out.println(val);
        }

    }
}

class ArrayListTest3{
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.add(1,100); //1번방에 100을 삽입 - 다음방은 밀려남
        list.add(3,200);
        System.out.println(list);
        list.remove(0);         //0번방 지우기
        System.out.println(list);

    }
}