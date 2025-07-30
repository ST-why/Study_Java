package oopClass.sec13;

public class Share {
    int a;
    static int staticA;

    public void set(int n){ // 인스턴스 메소드
        a+=n;
        staticA+=n;
    }

    public int showA() {
        return a;
    }

    static public int showStaticA() {
        return staticA;
    }
}
