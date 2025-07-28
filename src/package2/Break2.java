package package2;

public class Break2 {

    public static void main(String[] args) {
        Outter:
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'g') {
                    break;
                    // break문과 가장 가까운 for문을 벗어남
                }
                if (upper == 'K') {
                    break Outter;// Outter라는 라벨이 설정된 반복문 취소
                }
            }
        }

        System.out.println("프로그램 실행 종료");
    }
}
