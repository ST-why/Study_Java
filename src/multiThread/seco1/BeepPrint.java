package multiThread.seco1;

import java.awt.Toolkit;

public class BeepPrint {

    public static void main(String[] args) {
        // main thread
         Toolkit toolkit = Toolkit.getDefaultToolkit();

         //비프음 출력
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try{Thread.sleep(500);}catch(Exception e){}
        }
        //떙 출력
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try{Thread.sleep(500);}catch(Exception e){}
        }



    }



}
