package com.green.day19.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int num = 0;
        try {                              //예외(에러)가 발생할것 같은 코드
            num = 10;
            num = num / 0;
        } catch (Exception e) {            //예외 발생시 실행될 코드
            e.printStackTrace();
            System.out.println("예외발생");
            num = -1;
        } finally {                       //예외가 있든 없든 반드시 실행 - 무조건 실행 (옵션 : 있어도 되고 없어도됨)
            System.out.println("finally 실행 : " +num );
        }
        System.out.printf("num : %d \n", num);
        System.out.println("---끝---");
    }
}

class ExceptionEx1_2 {
    public static void main(String[] args) {
        div(20);
    }

    public static void div(int num) {
        try {
            num = 10;
            return;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외발생");
            num = -1;
        } finally {
            System.out.println("finally 실행");
        }
        System.out.printf("num : %d \n", num);
        System.out.println("---끝---");
    }
}

class ExceptionEx1_3 {
    public void sum() {
    }

    public static void main(String[] args) {
        try {
            //1 int num = 10/0;
            //2 ExceptionEx1_3 obj = null;
            //2 obj.sum();
            int[] arr = new int[10];
            arr[10] =10;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("수학적 예외");
        } catch (NullPointerException e) {
            System.out.println("널포인트 예외");
        } catch (Exception e) {
            System.out.println("모든예외");
        }
        System.out.println("끝");
    }
}