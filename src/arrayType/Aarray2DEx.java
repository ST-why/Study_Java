package arrayType;

import java.util.Scanner;

public class Aarray2DEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] test = {{"chair", "의자"},
            {"computer", "컴퓨터"},
            {"integer", "정수"}};

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length - 1; j++) {
                System.out.println("Q" + (i + 1) + ". " + test[i][j] + "의 뜻은?: ");
                String answer = sc.nextLine();

                if (answer.equals(test[i][1])) {
                    System.out.println("정답입니다.");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + test[i][1] + "입니다.");
                }
            }
        }
        sc.close();
    }

}

