package multiThread.sec02;

import java.awt.Toolkit;

public class BeepPrintEx2 {

    public static void main(String[] args) {
        // 익명 구현 객체 사용
        Thread thread = new Thread(new Runnable() {
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                //비프음 출력
                for (int i = 0; i < 5; i++) {
                    toolkit.beep(); // beep음 발생
                    try {
                        Thread.sleep(300);
                    } catch (Exception e) {
                    }
                }
            }
        });
        thread.start();

        //떙 출력 - 작업 2
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
        }


    }
}

