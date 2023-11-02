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
         /*String sql = "INSERT INTO board" +
                      "SET title = ? " +
                      ",ctnts = ? " +
                      ",writer = ? )";
                      업데이트 문 같은 인설트문  - 가독성이 좋음
                      */

        String sql = "INSERT INTO board " +
                "(title,ctnts,writer)" +
                "VALUES" +
                "(?, ?, ?)";

        PreparedStatement ps = null;    //PreparedStatement가 생기면서  ? 사용가능 문자열이면 자동'' 숫자면 그대로
        Connection conn = null;

        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);

            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());

            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);

        }
        return result;
    }

    public static List<BoardEntity> selBoardList() {
        //Board에 있는 컬럼의 값이 BoardEntity에 들어감
        //여러 레코드를 담기위해 ArrayList를 사용
        List<BoardEntity> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, writer, created_at FROM board ";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(); //셀렉트는 Query()문  나머지는 Update()문

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

            if (rs.next()){  //없는 레코드일때 값이 넘어오면 안되니 if나 while로 감싸줌
                // rs값 처음은 아무줄 선택안함 - rs.next()다음줄을 선택함 1번째레코드 선택 있다면 실행
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
}


