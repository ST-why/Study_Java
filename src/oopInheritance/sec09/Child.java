package oopInheritance.sec09;

public class Child extends Parent {

    @Override
    public void method2() {
        System.out.println("parent method2 - 재정의");
    }

    public void method3() {
        System.out.println("parent method3");
    }
}
