package oopInheritance.sec06;

public class Computer extends Calculator {
    // 컴파일러는 부모 클래스의 areaCircle 메소드의 정의부와 재정의되는 메소드의 정의부가 같은지 확인
    @Override
    double areaCircle(double r) { //default -> 부모클래스 메서드가 default 이므로 접근제한이 같거나 범위가 넓어야 함
        System.out.println("Computer 객체의 areaCircle 메소드 실행");
        return Math.PI * r * r;
    }

}
