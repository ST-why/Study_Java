package arrayType;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {
        int[] a;
        int b[];

        a = new int[3];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        System.out.println(a[1]);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println(a);
        //[I@a09ee92 [ -> 1차원 배열, I -> int, @16진수 가상 주소

        int[] score = new int[]{90, 30, 40};
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        // 선언해 놓은 b배열 생성하고 값 저장 -> {}: 선언시에만 가능한 문법
        // b = {10, 45, 70}
        b = new int[3]; //생성
        for (int i = 0; i < b.length; i++) {
            b[i] = i; // 0,1,2 저장
        }
        // 참조 타입의 배열
        String[] flowers = {"해바라기", "장미", "진달래"};
        for (int i = 0; i < flowers.length; i++) {
            System.out.println(flowers[i] + " ");
        }

        System.out.println();

        // Arrays 클래스의 toString() 메소드 사용 - 전체 배 값 출력
        System.out.println(Arrays.toString(flowers));

        //배열 길이가 0인 배열 생성
        int score1[] = new int[0];
        int score2[] = new int[]{};
        int[] score3 = {};
        System.out.println(score1.length);
        System.out.println(score2.length);
        System.out.println(score3.length);

    }

}
