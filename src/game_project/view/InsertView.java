package game_project.view;

import game_project.controller.Controller;
import game_project.model.LoginDTO;
import java.util.Objects;
import java.util.Scanner;

// 회원가입
public class InsertView {
    Controller controller = Controller.getInstance();

    public void insert(){
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String username = sc.nextLine();

        System.out.print("ID를 입력하세요: ");
        String userId = sc.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String password = sc.nextLine();

        controller.insert(new LoginDTO(username,userId,password));
    }
}
