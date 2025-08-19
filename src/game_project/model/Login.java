package game_project.model;

import game_project.util.DbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;
import java.util.Scanner;

// 회원가입 및 로그인
public class Login implements LoginDAO {

    // 사용자 정보 받기
    @Override
    public boolean insert(LoginDTO dto) throws Exception {
        Connection con = null;
        PreparedStatement pstmt = null;

        try{
            con = DbConnect.getConnection();
            pstmt = con.prepareStatement("insert into login values(?,?,?)");

            pstmt.setString(1, dto.getUserId());
            pstmt.setString(2, dto.getPassword());
            pstmt.setString(3, dto.getUsername());

            int result = pstmt.executeUpdate();
            if(result == 0){
                return false;
            }

        }catch(Exception e){
            throw e;
        }finally {
            DbConnect.close(con,pstmt);
        }
        return true;
    }

    // 로그인 진행
    @Override
    public boolean login(LoginDTO dto) throws Exception {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = DbConnect.getConnection();
            pstmt = con.prepareStatement("select * from login where userId = ? and password = ?");
            pstmt.setString(1, dto.getUserId());
            pstmt.setString(2, dto.getPassword());
            rs = pstmt.executeQuery();

            if(rs.next()){
                return true;
            }
        }catch(Exception e){
            throw e;
        }finally {
            DbConnect.close(con,pstmt,rs);
        }
        return false;
    }

    @Override
    public boolean delete(LoginDTO dto) throws Exception {
        Connection con = null;
        PreparedStatement pstmt = null;

        try{
            con = DbConnect.getConnection();
            pstmt = con.prepareStatement("delete from login where userId = ? and password = ?");
            pstmt.setString(1, dto.getUserId());
            pstmt.setString(2, dto.getPassword());
            int result = pstmt.executeUpdate();

            if(result == 0){
                return false;
            }

        }catch(Exception e){
            throw e;
        }finally {
            DbConnect.close(con,pstmt);
        }
        return true;
    }

}
