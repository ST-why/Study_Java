package arrayType;

public class ArraySystemCopy {

    public static void main(String[] args) {
        //System.arrayCopy(원본, 시작인덱스, 대상, 시작인덱스, 복사할 개수)
        int[] a = {1, 2, 3, 4};
        int[] b = new int[a.length];

        System.arraycopy(a, 0, b, 1, 3);
        // 목적지 배열의 idx값 확인해야 함 (out of bounds)

        // System.arraycopy(a, 0, b, 1,a.length);
        // arraycopy: last destination index 5 out of bounds for int[4]

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
