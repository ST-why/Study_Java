package arrayType;

public class ArrayCopy {

    public static void main(String[] args) {
        // 얕은 복사 : 참조 주소만 복사 (변수끼리 잠조값 공유) => = 이용
        // 변수 이름만 다르고 동일한 배열 참조
        // 원본 변수를 통해 변경하면 복사본 참조 내용도 변경됨

        int a [] = {1,2,3,4};
        int b [] = a;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }

        System.out.println();
        b[0] = 10;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
    }
}
