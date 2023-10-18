package com.green.day14.ch6;

public class Document {
    static int cnt;
    String name;

    {
        ++cnt;
    }

    public Document() {
        this.name = String.format("제목없음%d", cnt);
        System.out.printf("문서 %s가 생성되었습니다.\n", this.name);
        //this(String.format("제목없음%d", cnt));
    }

    public Document(String name) {
        this.name = name;
        System.out.printf("문서 %s가 생성되었습니다.\n", this.name);
    }
}


class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document(); //문서 제목없음1(이)가 생성되었습니다.
        Document d2 = new Document("자바.txt");//문서 자바.txt(이)가 생성되었습니다.
        Document d3 = new Document();//문서 제목없음2(이)가 생성되었습니다.
        Document d4 = new Document();//문서 제목없음3(이)가 생성되었습니다.
        Document d5 = new Document();//문서 제목없음4(이)가 생성되었습니다.

    }
}
