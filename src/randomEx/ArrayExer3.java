package randomEx;

public class ArrayExer3 {

    public static void main(String[] args) {

        int[] number = new int[45];

        int[] rotto = new int[6];

        for (int i = 0; i < 45; i++) {
            number[i] = i + 1;
        }

        for (int i = 0; i < 6; i++) {
            int random = (int) (Math.random() * 45) + 1;

            for (int j = 0; j <= i; j++) {
                if (rotto[j] != number[random]) {
                    rotto[i] = number[random];
                    System.out.printf("숫자%d : %d\n", i + 1, rotto[i]);
                    break;
                } else {
                    i--;
                }
            }

        }
    }

}
