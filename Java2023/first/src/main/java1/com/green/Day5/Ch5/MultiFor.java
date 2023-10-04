package com.green.Day5.Ch5;

public class MultiFor {
    public static void main(String[] args) {
        for(int h=0; h<10; h++){

            for(int m=0; m<7;m++){
                System.out.printf("h:%d - m:%d\n", h,m);//밖의 for문이 안의 for문을 귀속하고 있다고 생각하면 됨
                //안쪽for문이 시행되괴 끝맺음이 나야 밖의 for문이 작동함.
            }
        }
    }
}
