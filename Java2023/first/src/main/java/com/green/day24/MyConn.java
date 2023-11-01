package com.green.day24;

import java.sql.*;

public class MyConn {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/board_ver1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "green502";

    public static Connection getConn(){
        Connection conn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver"); //패키지
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        } catch (Exception e) {
            System.out.println("에러발생");
            e.printStackTrace();
        }
        System.out.println("접속 성공");
        return conn;
    }

    public static void close(Connection conn, PreparedStatement ps) {
        if (ps != null) {  //따로 적는 이유 : 같이 적으면 먼저 에러가 터지면 바로 캐치문으로 이동 밑이 실행안됨
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn,ps);
    }
}
