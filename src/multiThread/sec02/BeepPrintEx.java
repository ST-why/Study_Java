package multiThread.sec02;

public class BeepPrintEx {

    public static void main(String[] args) {
        // 문자 출력 담당 쓰레드
        Runnable beepTask = new BeepTask(); // 쓰레드가 진행할 작업 객체
        // 두번째 스레드 구성 - 작업 task 전달
        Thread thread = new Thread(beepTask);  // 작업객체를 포함한 스레드 생성

        thread.start(); // 두 개의 쓰레드 작동 (멀티 쓰레드: main, beepTask 쓰레드 작동) // beep음 출력 - 작업 1

        //떙 출력 - 작업 2
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try{Thread.sleep(300);}catch(Exception e){}
        }


    }

}
