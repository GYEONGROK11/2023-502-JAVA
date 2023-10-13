package com.green.day12.ch6;

public class MethodExam3 {

    int sumText(String str) {
        int val = Integer.parseInt(str);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int modVal = val % 10;
            sum += modVal;
            val /= 10;
        }
        return sum;
    }

    int sumText1(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char result = str.charAt(i);
            int val = Character.getNumericValue(result);
            sum += val;
        }
        return sum;
    }

    int sumText2(String str) {
        char[] charArr = str.toCharArray();
        int sum = 0;
        for (char ch : charArr) {
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }

    public static void main(String[] args) {
        MethodExam3 me3 = new MethodExam3();
        int sum = me3.sumText("123123");
        System.out.println(sum);
        int sum1 = me3.sumText1("123123");
        System.out.println(sum1);
        int sum2 = me3.sumText2("123123");
        System.out.println(sum2);
    }

}
