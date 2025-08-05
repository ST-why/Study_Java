package oopExcetion.sec04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("정수1 입력: ");
            int a = sc.nextInt();
            System.out.print("정수2 입력: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("나누기 결과: " + result);

        } catch (InputMismatchException e) {
            System.out.println("잘못 입력하셨습니다. ");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println("예외 발생: " + e);
        }
        sc.close();
    }

}
