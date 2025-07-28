package arrayType;

import java.util.Arrays;

public class ArrayCopyRange {

    public static void main(String[] args) {
        // Arrays.copyOfRange(원본배열, 시작인덱스, 끝인덱스-1)
        // : 원본배열에서 시작인덱스 ~ 끝 인덱스까지 원소 복사 후 새로운 배열 생성
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOfRange(a, 0, 3);

        System.out.println("a");
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("b");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();
        b[0] = 10;

        System.out.println("b[0]값 바꾼 후 a");
        for (int i = 0; i < a.length; i++) {
            System.out.print(+a[i] + " ");
        }

        System.out.println();
        System.out.println("b[0]값 바꾼 후  b");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

}
