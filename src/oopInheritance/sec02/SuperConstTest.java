package oopInheritance.sec02;

class A {

    public A() {
        System.out.println("클래스 A");
    }

    public A(int x) {
        System.out.println("클래스 A: " + x);
    }
}

class B extends A {

    public B() {
        System.out.println("클래스 B");
    }

    public B(int x) {
        System.out.println("클래스 B: " + x);
    }
}

class C extends B {

    public C() {
        System.out.println("클래스 C");
    }

    public C(int x) {
        super(x);
        System.out.println("클래스 C: " + x);
        // super 메소드를 사용하려면 생성자 내에서 먼저 호출을 해야함, this 메서드 또한 첫 줄에 작성
    }

    public void tmp() {
        //spuer(x); 일반 메서드에서는 사용불가, 생성자 내에서만 가능
    }
}


public class SuperConstTest {

    public static void main(String[] args) {
        //C c = new C();

        C c1 = new C(5);
    }

}
