package game_project.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbConnect {

    public static Connection getConnection() {
        Connection con = null;

        try{
            String url = "jdbc:oracle:thin:@localhost:1521:sdb";
            String user = "C##PROJECTDB";
            String pwd = "1234";

            con = DriverManager.getConnection(url, user, pwd);
            if(con != null){
                System.out.println("DB 연결 성공!");
            }else {
                System.out.println("DB 연결 실패!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }

    public static void close(Connection con, PreparedStatement stmt, ResultSet rs) {

        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }

            if (stmt != null) {
                stmt.close();
                stmt = null;
            }

            if (con != null) {
                con.close();
                con = null;
            }

        } catch (Exception e) {

        }
    }


    public static void close(Connection con, PreparedStatement stmt) {

        try {
            if (stmt != null) {
                stmt.close();
                stmt = null;
            }

            if (con != null) {
                con.close();
                con = null;
            }

        } catch (Exception e) {

        }
    }

    public static void close(PreparedStatement stmt, ResultSet rs) {

        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }

            if (stmt != null) {
                stmt.close();
                stmt = null;
            }

        } catch (Exception e) {

        }
    }

    public static void close(Connection con) {
        try {

            if (con != null) {
                con.close();
                con = null;
            }

        } catch (Exception e) {

        }
    }

    public static void close(PreparedStatement pstmt) {
        try {

            if (pstmt != null) {
                pstmt.close();
                pstmt = null;
            }

        } catch (Exception e) {

        }
    }

}
