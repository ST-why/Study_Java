package game_project.controller;

import game_project.model.Login;
import game_project.model.LoginDAO;
import game_project.model.LoginDTO;

public class Controller {

    private static Controller instance = new Controller();

    private Controller() {
    }

    public static Controller getInstance() {
        return instance;
    }

    Login dao = new Login();

    public void insert(LoginDTO newDto) {
        try {
            LoginDTO dto = new LoginDTO();
            dto.setUsername(newDto.getUsername());
            dto.setUserId(newDto.getUserId());
            dto.setPassword(newDto.getPassword());

            if (dao.insert(dto)) {
                System.out.println("회원가입 성공");
            } else {
                System.out.println("회원가입 실패");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void login(String userId, String password) {
        try {
            LoginDTO dto = new LoginDTO();
            dto.setUserId(userId);
            dto.setPassword(password);

            if (dao.login(dto)) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패");
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void delete(String usrId, String password) {
        try {
            LoginDTO dto = new LoginDTO();
            dto.setUserId(usrId);
            dto.setPassword(password);

            if (dao.delete(dto)) {
                System.out.println("탈퇴 성공!");
            } else {
                System.out.println("탈퇴 실패!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
