package oopInheritance.sec09;

public class ParentChildMain {

    public static void main(String[] args) {
        Child child = new Child(); // Chuld 타입

        // 자동타입변환과 다향성
        Parent parent ;
        // Parent 타입 객체 인스턴스 참조를 child 타입의 인스턴스 연결
        parent = child; // 자동 타입 변환 -> subclass 객체가 superclass로 자동 타입 변환

    }

}
