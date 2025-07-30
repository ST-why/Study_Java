package oopClass.sec12;

public class CalculatorMain {

    public static void main(String[] args) {
        // Calculator 클래스는 static 멤버로만 이루어진 클래스
        // 객체 인스턴스 멤버가 없으므로 객체 생성이 필요 없음

        double result1 = 10*10*Calculator.pi;
        System.out.println(Calculator.minus(10,5));
        System.out.println(Calculator.plus(10,5));
    }

}
