package oopInheritance.sec10;

public class AnimalMain {

    public static void main(String[] args) {
        // 자동타입벼환 사용가능 멤버 예외 예제

        Animal ani;
        ani = new Animal();
        ani.show();
        ani.sound();

        ani = new Cat(); // Cat 타입의 객체를 Animal 타입의 변수에 대입하면 타입 불일치가 발생
                        // 자동 타입 변환: subClass가 superclass 타입으로 변환
        ani.show();
        ani.sound();

        ani = new Dog();
        ani.show();
        ani.sound();


    }

}

