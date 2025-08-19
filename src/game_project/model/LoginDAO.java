package game_project.model;

// 회원가입 및 로그인 인터페이스
public interface LoginDAO {

    // username, userId, password를 사용자로 부터 받아 저장 (회원가입)
    boolean insert(LoginDTO dto) throws Exception;

    // userId와 password로 (로그인)
    boolean login(LoginDTO dto) throws Exception;

    // 회원탈퇴
    boolean delete(LoginDTO dto) throws Exception;


}
