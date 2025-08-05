package multiThread.sec02;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
    // beep음 출력담당 - Runnable 구현
    Runnable runnable;
    @Override
    public void run(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        //비프음 출력
        for (int i = 0; i < 5; i++) {
            toolkit.beep(); // beep음 발생
            try{Thread.sleep(300);}catch(Exception e){}
        }
    }

}
