package refType;

public class StringEquals {

    public static void main(String[] args) {
        String strvar1 = "홍길동";
        String strvar2 = "홍길동";

        if(strvar1 == strvar2){
            System.out.println("strVal1과 strVal2는 참가 같다");

        }else{
            System.out.println("starVal1과 strVar2는 참조가 같지 않다");
        }
        // strVal1은 String 클래스의 객체참조 변수 -> 클래스 메소드 사용가능
        // equals는 참조객체의 값이 같은지 확인하는 메소드
        if(strvar1.equals(strvar2)){
            System.out.println("strVar1과 strVar2는 저장 문자열 값이 같다");
        }
        //문자열 객체 생성 2 : String 변수명 = new String("홍길동");
        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if(strVar3 == strVar4){
            System.out.println("strVal3과 strVal4는 참가 같다");

        }else{
            System.out.println("starVal3과 strVar4는 참조가 같지 않다");
        }
        if(strVar3.equals(strVar4)){
            System.out.println("strVar3과 strVar4는 저장 문자열 값이 같다");
        }

    }

}
