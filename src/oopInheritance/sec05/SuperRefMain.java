package oopInheritance.sec05;

class SuperClass {
    int x; // 디폴트 타입의 인스턴스 멤버 변수 선언 -> 동일 패키지 클래스에게 상속됨
    int y; //

    public SuperClass() {
        x=5;
        y=50;
    }
}

class SubClass extends SuperClass {
    int x;

    public SubClass() {
        x=10;
    }

    public void show() {
        System.out.println(x);
        System.out.println("sub: " + this.x);
        System.out.println("super: " + super.x);
        System.out.println(y);
    }
}

public class SuperRefMain {

    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.show();
    }
}
