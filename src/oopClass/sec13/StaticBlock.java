package oopClass.sec13;

public class StaticBlock {

    // static 블록 - static 멤버만 모아놓은 영역, 모든 static 멤버가 영역에 무조건 있어야 하는 건 아님
    // 인스턴스 필드와 메소드
    int a;

    void method() {
        System.out.println("인스턴스 메소드");
    }

    static int staticA;

    static void staticMethod() {
        System.out.println("static 메소드");
    }

    // static 블록
    static {
        int b = 1;
        //method(); // 인스턴스 메소드 사용 불가
        staticA = 10;
        staticMethod();
    }

    //static 필드의 선언과 초기화는 static 블럭을 이용함 - 클래스가 메서드영역으로 로딩돌 때 자동으로 실행됨
    static {
        int c = 0;
        double bs = 5.0;

    }
    {// 인스턴스 필드는 대부분 생성자 통해서 초기화 이루어지기 때문에 초기화 블럭을 사용하지 않는다.
        int a1 = 10;
        int b1 = 50;
    }

    static void staticMethod2() {
        // static 메소드에서는 this 사용불가
        // this.a = 2;
        // 객체를 생성하고 인스턴스로 접근하는건 가능
        StaticBlock s = new StaticBlock();
        s.a = 200;
        s.method();
    }

}
