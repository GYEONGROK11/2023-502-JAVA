package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;


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


class MyConnTest2 {
    public static void main(String[] args) {
        //title : 처음 작성
        //ctnts : 처음 작성하는 내용입니다
        //wirter : 홍길동

        BoardEntity entity = new BoardEntity(); //객체생성 이유 : 사람들이 다른 게시물을 쓰기 때문에 각각 다른 객체에 담겨야됨
        entity.setTitle("배고프다");
        entity.setCtnts("닭갈비");
        entity.setWriter("기리길동");
        int row = BoardDao.insBoard(entity); // 영향받은 행 수
        System.out.println(row);
    }
}

class MyConnTest3 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(2);

        int row = BoardDao.delBoard(entity);
        System.out.println(row);
    }

}

class MyConnTest4 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(3);
        entity.setTitle("할로");
        entity.setCtnts("할로윈");
        entity.setWriter("할로");

        int row = BoardDao.updBoard(entity);
        System.out.println(row);
    }
}

class MyConnTest5 {
    public static void main(String[] args) {
        List<BoardEntity> list = BoardDao.selBoardList();

        for (BoardEntity entity : list) {
            System.out.println(entity);
        }
    }
}

class MyConnTest6 {
    public static void main(String[] args) {

        BoardEntity result = BoardDao.selBoardById(3);
        System.out.println(result);
    }
}