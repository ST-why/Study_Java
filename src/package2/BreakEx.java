package package2;

import java.util.Scanner;

public class BreakEx {

    public static void main(String[] args) {
        int balance = 100000;
        int withdrawal = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("인출액 입력: ");
            withdrawal = sc.nextInt();

            if (balance < withdrawal) {
                break;
            }
            balance -= withdrawal;

        }

        System.out.println("잔액부족. 현재 잔액: " + balance);
    }

}
