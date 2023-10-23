package com.green.day18.ch7;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap();     // 순서 개념이 없음 - key만 입력 하면 값을 받음    순서개념이 없어 향상된 for문 못씀
        map.put("a", 10);             //key(이름)와 value(물건)
        map.put("b", 20);
        map.put("b", 30);             //중복되면 덮어쓰기
        Object obj = map.get("b");   //key만 입력 하면 값을 받음
        int val = (int) obj;
        System.out.println("val : " + val);
    }
}

class HashMapTest2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Tv", 0);
        map.put("Computer", 0);
        map.put("Audio", 0);

        map.put("Tv", map.get("Tv")+1);
        map.put("Tv", map.get("Tv")+1);
        map.put("Tv", map.get("Tv")+1);


        System.out.println("Tv-Count : " + map.get("Tv"));
    }
}


