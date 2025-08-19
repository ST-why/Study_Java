package game_project.view;

import game_project.controller.Controller;
import game_project.model.LoginDTO;
import java.util.Scanner;

// 로그인
public class LoginView {

    Controller controller = Controller.getInstance();

    public void login() {
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디를 입력하세요: ");
        String userId = sc.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String password = sc.nextLine();

        controller.login(userId,password);
    }
}

