package game_project.model;

import java.util.Scanner;

// 가위바위보 게임 클래스
public class GaBaBo implements GameDAO {

    private int myChoice;
    private int computerChoice;
    private String a;
    private String[] b = {"가위", "바위", "보"};

    @Override
    public void playGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println(" 가위 바위 보를 시작합니다!");
        try {
            while (true) {
                System.out.println("*********************************");
                System.out.println("번호를 선택 해주세요: 1. 가위, 2. 바위, 3. 보");
                myChoice = sc.nextInt();
                computerChoice = (int) (Math.random() * 3) + 1;

                if (b[myChoice - 1].equals(b[computerChoice - 1])) {
                    System.out.println("컴퓨터: " + b[computerChoice - 1]);
                    System.out.println("비겼습니다!");
                } else if (b[myChoice - 1].equals("가위") && b[computerChoice - 1].equals("바위")) {
                    System.out.println("컴퓨터: " + b[computerChoice - 1]);
                    System.out.println("당신이 졌습니다 ㅜㅜ ");
                } else if (b[myChoice - 1].equals("가위") && b[computerChoice - 1].equals("보")) {
                    System.out.println("컴퓨터: " + b[computerChoice - 1]);
                    System.out.println("당신이 이겼습니다!");
                } else if (b[myChoice - 1].equals("바위") && b[computerChoice - 1].equals("가위")) {
                    System.out.println("컴퓨터: " + b[computerChoice - 1]);
                    System.out.println("당신이 이겼습니다!");
                } else if (b[myChoice - 1].equals("바위") && b[computerChoice - 1].equals("보")) {
                    System.out.println("컴퓨터: " + b[computerChoice - 1]);
                    System.out.println("당신이 졌습니다 ㅜㅜ ");
                } else if (b[myChoice - 1].equals("보") && b[computerChoice - 1].equals("가위")) {
                    System.out.println("컴퓨터: " + b[computerChoice - 1]);
                    System.out.println("당신이 졌습니다 ㅜㅜ ");
                } else if (b[myChoice - 1].equals("보") && b[computerChoice - 1].equals("바위")) {
                    System.out.println("컴퓨터: " + b[computerChoice - 1]);
                    System.out.println("당신이 이겼습니다!");
                } else {
                    System.out.println("오류");
                }

                System.out.print("계속 하시겠습니까?(y/n): ");
                String a = sc.next();

                if (a.equals("n")) {
                    break;
                } else if (a.equals("y")) {

                } else {
                    System.out.println("잘못 입력하셨습니다. ");

                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("번호를 잘못 입력했습니다. 다시 입력해주세요(1, 2, 3)" );
            playGame();
        }
    }


}
