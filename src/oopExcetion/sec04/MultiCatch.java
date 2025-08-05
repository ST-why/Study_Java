package oopExcetion.sec04;

public class MultiCatch {

    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int a = arr[5];
            int var = Integer.parseInt("a100");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외처리 1 : 배열 범위 오류, 문자열 숫자변환 오류를 처리" + e);

        } catch (Exception e) {
            System.out.println("예외처리 2 : 배열 인덱스 범위 오류, 문자열 숫자 ");
        }
    }

}
