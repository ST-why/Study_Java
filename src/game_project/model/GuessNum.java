package game_project.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// 야구 게임 클래스
public class GuessNum implements GameDAO {

    private ArrayList<Integer> comNumber = new ArrayList<>();
    private ArrayList<Integer> myNum = new ArrayList<>();
    private int myNumber;
    private int strike;
    private int ball;


    @Override
    public void playGame() {
        Scanner sc = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("숫자 맞히기 게임을 시작합니다!");
        System.out.println("세자리 전부를 맞혀야 합니다.");

        // 숫자 세팅
        for (int i = 0; i < 3; i++) {
            int randomNum = (int) (Math.random() * 9);
            if (!comNumber.contains(randomNum)) {
                comNumber.add(randomNum);
            } else {
                i--;
            }
        }

        while (true) {
            System.out.println("숫자 중복 없이 세자리를 입력하세요! ");
            System.out.println("*********************************");

            myNum.clear();
            strike = 0;
            ball = 0;

            // 숫자 입력
            for (int i = 0; i < comNumber.size(); i++) {
                System.out.print("1~9사이 숫자 한개만 입력: ");
                myNumber = sc.nextInt();
                if (myNumber > 9) {
                    System.out.println("잘못 입력하셨습니다.");
                    i--;
                } else {
                    myNum.add(myNumber);
                }

            }

            // if1 값이 있음 -> if1-1 인덱스 값음 -> 스트라이크 else -> 볼
            for (int i = 0; i < comNumber.size(); i++) {
                if (comNumber.contains(myNum.get(i))) {
                    if (comNumber.get(i) == myNum.get(i)) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
                if (strike == 3) {
                    System.out.println("축하합니다! 정답입니다!");
                }
            }

            System.out.println("스트라이크 갯수: " + strike);
            System.out.println("볼 갯수: " + ball);

            System.out.println("포기하겠습니까? (y/n) ");
            String answer = sc.next();
            if (answer.equals("y")) {
                System.out.print("정답: ");
                Iterator<Integer> it = comNumber.iterator();
                while (it.hasNext()) {
                    System.out.print(it.next() + " ");
                }
                System.out.println("\n");
                break;
            }
        }

    }
}


