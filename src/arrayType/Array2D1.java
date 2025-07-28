package arrayType;

public class Array2D1 {

    public static void main(String[] args) {
        // 2차원 배열 선언 할당 저장 => {{행의, 원소, 나열},
        //                          {열의, 원소, 나열}}
        int[][] score = {{100, 100, 100},
            {20, 20, 20}};

        // 다차원 배열 원소의 접근
        System.out.println(score[0][1]);

        // 배열 전체 순회
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + " ");
            }
        }

    }

}
