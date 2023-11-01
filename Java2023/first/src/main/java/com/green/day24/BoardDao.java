package com.green.day24;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Dao = data access object 줄임말
public class BoardDao {
    public static int insBoard(BoardEntity entity) {
        int result = 0;
        String sql = "INSERT INTO board " +
                "(title,ctnts,writer)" +
                "VALUES" +
                "(?, ?, ?)";

        PreparedStatement ps = null;
        Connection con = null;

        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);

            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());

            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);

        }
        return result;
    }

    public static List<BoardEntity> selBoardList() {
        List<BoardEntity> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, writer, created_at FROM board ";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(); //셀렉트는 Query()문  나머지는 Update()

            while (rs.next()){ // 1행부터 체크 레코드가 있으면 true 없으면 반복문 끝
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");

                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(title);
                entity.setWriter(writer);
                entity.setCreatedAt(createdAt);
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps, rs);
        }
        return list;
    }

    public static int updBoard(BoardEntity entity) {
        int result = 0;
        String sql = "UPDATE board " +
                "SET title = ?" +
                "  , ctnts = ?" +
                "  , writer = ? " +
                "  , updated_at = now() " +
                "WHERE iboard = ?";

        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps.setInt(4, entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);
        }
        return result;
    }

    public static int delBoard(BoardEntity entity) {
        int result = 0;
        String sql = "DELETE FROM board " +
                "WHERE iboard = ?";

        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);
        }
        return result;
    }

    public static BoardEntity selBoardById(int pk) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, writer, ctnts, created_at, updated_at FROM board WHERE iboard = ?";

        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pk);
            rs = ps.executeQuery();
            if (rs.next()){
                BoardEntity entity = new BoardEntity();
                String title = rs.getString("title");
                String ctnts = rs.getString("ctnts");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");
                String updatedAt = rs.getString("updated_at");

                entity.setIboard(pk);
                entity.setTitle(title);
                entity.setCtnts(ctnts);
                entity.setWriter(writer);
                entity.setCreatedAt(createdAt);
                entity.setUpdatedAt(updatedAt);
                return entity;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps, rs);
        }
        return null;
    }
}


