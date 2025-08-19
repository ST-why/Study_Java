package game_project.view;

import game_project.model.GaBaBo;
import game_project.model.GuessNum;
import game_project.util.AppInfo;
import game_project.model.Login;
import java.util.Scanner;

// 메인 페이지 크래스
public class App {

    private int choice;
    Scanner sc = new Scanner(System.in);
    Login login = new Login();
    AppInfo appInfo = new AppInfo();
    GaBaBo gaBaBo = new GaBaBo();
    GuessNum guessNum = new GuessNum();

    public void mainPage() {

        System.out.println("*********************************");
        System.out.println("게임에 오신 것을 환영합니다.");
        System.out.println("*********************************");

        while (true) {
            System.out.println("                메뉴              ");
            System.out.println("---------------------------------");
            System.out.println("1. 애플리케이션 정보");
            System.out.println("2. 회원가입");
            System.out.println("3. 로그인");
            System.out.println("4. 회원탈퇴");
            System.out.println("5. 가위바위보 게임");
            System.out.println("6. 야구 게임");
            System.out.println("7. 종료");
            System.out.println("---------------------------------");
            System.out.print("메뉴 번호 입력:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    appInfo.appInfo();
                    break;
                case 2:
                    InsertView insertView = new InsertView();
                    insertView.insert();
                    break;
                case 3:
                    LoginView loginView = new LoginView();
                    loginView.login();
                    break;
                case 4:
                    DeleteView deleteView = new DeleteView();
                    deleteView.delete();
                    break;
                case 5:
                    gaBaBo.playGame();
                    break;
                case 6:
                    guessNum.playGame();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

}
