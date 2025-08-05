package oopApi.sec03;

import java.util.StringTokenizer;

public class strToken {

    public static void main(String[] args) {
        // StringTokenizer 클래스 활용
        // 메서드 : countTokens() - 남아있는 토큰 수
        // hasMoreTokens() - 남아있는 토근이 있는지 여부
        // nextToken() - 토큰을 하나씩 꺼내옴
        // 토큰은 더 이상 분해되지 않는 가장 작은 원소 값

        String text = "홍길동/이수홍/박연수";
        // st는 토큰화된 문자열들이 저장되어 있음
        StringTokenizer st = new StringTokenizer(text, " /");
        //토큰 수 확인
        int countToken = st.countTokens();
        System.out.println("토큰 수: " + countToken);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

}
