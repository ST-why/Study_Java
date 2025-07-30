package oopInheritance.sec01;

public class Inheritance {

    public static void main(String[] args) {
        Child ob = new Child(); // Child 클래스 인스턴스도 생성하지만 Parent 클래스 인스턴스도 생성되어야 한다
        ob.setChild();// Child 클래스 메소드
        // Child 클래스 인스턴스 통해서 부모 클래스 메소드 호출
        ob.setParent(10);
        ob.showChild();// 클래스 내부 코드에 부모 클래스 메소드 호출하고 있음
        ob.showParent();// 부모클래스 메소드 호출가능 (public)

        Parent p = new Parent();
        p.showParent();

        // p.showChild(); // 자식은 부모를 상속받고 알수 있지만 부모는 알지 못함



    }

}
