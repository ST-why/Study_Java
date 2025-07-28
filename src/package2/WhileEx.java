package package2;

import java.util.Scanner;

public class WhileEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (num != 7) {

            System.out.println("숫자 입력: ");
            num = sc.nextInt();
        }

        System.out.println("7이 입력되었습니다. 종료합니다!");
        sc.close();
    }
}
