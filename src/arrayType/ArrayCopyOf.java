package arrayType;

import java.util.Arrays;

public class ArrayCopyOf {

    public static void main(String[] args) {
        // Arrays.copyOf(원본배열, 복사되는 배열의 크기);
        int[] a = {1, 2, 3, 4};
        //int[] b = Arrays.copyOf(a, a.length);
        //int[] b = Arrays.copyOf(a, 7);
        int[] b = Arrays.copyOf(a, 2);

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

