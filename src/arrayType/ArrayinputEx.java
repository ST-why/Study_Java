package arrayType;

import java.util.Scanner;

public class ArrayinputEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int max = num[0];

        System.out.println(" 숫자 입력 ");
        for (int i = 0; i < num.length; i++) {
            System.out.printf("num[%d] : ", i);
            num[i] = sc.nextInt();
        }

        System.out.println("입력된 값: ");

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

            if (max < num[i]) {
                max = num[i];
            } else {

            }
        }
        System.out.println(" ");

        System.out.println("최대값: " + max);

    }
}
