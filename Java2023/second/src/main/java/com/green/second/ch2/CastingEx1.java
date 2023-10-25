package com.green.second.ch2;

public class CastingEx1 {
    public static void main(String[] args) {
        byte v1 = 10;
        short v2 = 20;
        int v3 =30;
        long v4 =40;
        float v5 =50.1f;
        double v6 = 60.1;

        v2=v1;  //자동 형변환
        v3=v2;
        v4=v3;
        v5=v4;  // 4바이트 float 는 계산식이라 가능
        v6=v5;

        v5 = (float) v6;  //강제형변환
        v4 = (long) v5;

        String str = "안녕 " +v6; //String은 모든 값 자동형변환
        System.out.println(str);
    }
}
