package game_project.view;

import game_project.controller.Controller;
import java.util.Scanner;

public class DeleteView {

    Controller controller = Controller.getInstance();

    public void delete() {
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디를 입력하세요: ");
        String userId = sc.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String password = sc.nextLine();

        controller.delete(userId,password);
    }

}
