package oopApi.sec02;

import java.io.IOException;

public class KeyBoardToStringEx {

    public static void main(String[] args) throws IOException {
        // 사용자로부터 키코드 입력받고 문자열로 출력
        byte[] bytes = new byte[100];

        System.out.println("입력: ");
        int readyByteNO = System.in.read(bytes); // read()는 IOException 이 throws 처리되어 있음 -> main에서 예외처리를 호출쪽으로 던짐
        //keyboard로부터의 입력은 입력 종료기화 enter까지 전달돰]
        //


        System.out.println(readyByteNO + "바이트");
        String str = new String(bytes, 0, readyByteNO);


        }
    }


