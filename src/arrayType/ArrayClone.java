package arrayType;

public class ArrayClone {

    public static void main(String[] args) {
        // 최상위객체 Object 존재함 Object.clone() 사용한 깊은 복사
        int[] a = {1, 2, 3, 4};
        int[] b = a.clone();

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

