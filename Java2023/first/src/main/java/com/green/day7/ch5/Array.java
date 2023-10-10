package com.green.day7.ch5;

public class Array {
    public static void main(String[] args) { //배열  //래퍼런스 타입으로 변경 주소값만 저장 가능  원래는 변수안에 1개의 값만 저장 가능
        //배열은 같은 타입 여러개 값 저장 가능   주소값을 담는 크기 8Byte = 64bit
        int n1 = 10, n2 = 20, n3 = 30;
        int[] arr = {10, 20, 30};  //{배열}에 접근할수 있는 주소값 저장
        String[] arr2 = {"A","B","가가","나나"};

        int[] arr3 = new int[30]; //  []안에는 방의 개수 - 각방에는 0이 들어가있음  {0,0,0}  방번호는 0부터 시작 0 1 2 - (방은 인덱스)
        int arr4[] = new int[200]; // 가능은 하지만 java에선 안씀
        arr[0] = 200;
        int val = arr[0];

        System.out.println("val : "+val);
        System.out.println("arr[0] : "+arr[0]);
        System.out.println("arr[1] : "+arr[1]);
        System.out.println("arr[2] : "+arr[2]);

        System.out.println("arr.length3 : " + arr3.length);
        System.out.println("arr.length4 : " + arr4.length);

    }
}
