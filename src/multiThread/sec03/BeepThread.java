package multiThread.sec03;

import java.awt.Toolkit;

public class BeepThread extends Thread {

    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep(); // beep음 발생
            try
            {Thread.sleep(300);
            }catch(Exception e) {}
        }
    }
}
