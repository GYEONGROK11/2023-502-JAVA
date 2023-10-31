package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class MyConnTest {
    public static void main(String[] args) {

        Connection conn = MyConn.getConn();
        String sql = "INSERT INTO country (country_id, country) VALUES (111,'경현나라')";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println("result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class MyConnTest2{
    public static void main(String[] args) {
        //title : 처음 작성
        //ctnts : 처음 작성하는 내용입니다
        //wirter : 홍길동

        BoardEntity entity = new BoardEntity();
        entity.setTitle("오늘 Insert 배움");
        entity.setCtnts("Java를 통해 board테이블에 값 넣어봄");
        entity.setWriter("기리길동");
        int row = BoardDao.insBoard(entity); // 영향받은 행 수
        System.out.println(row);
    }
}