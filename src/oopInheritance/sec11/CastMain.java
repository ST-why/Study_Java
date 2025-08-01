package oopInheritance.sec11;

public class CastMain {

    public static void main(String[] args) {
        Animal al = null;

        al = new Dog(); // 자동 타입 변환
        al.show(); // Dog 클래스에서 재정의 해 놓은 메서드가 호출된 상태
        al.sound();

        al.animalMethod(); // Animal 클래스의 메서드가 호출
        //al.dogMethod(); // 자식 클래서의 메서드는 사용 불가

        // Dog 클래스 참조변수 선언
        // al 타입은 Animal 임, 참조 객체는 Dog 타입의 객체를 참조중임(자동타입변환)
        Dog dog = (Dog)al;
        dog.dogMethod();
        dog.animalMethod();

        // instansof: 객체가 참조하고 있는 인스턴스의 타입 검사하는 연산자
        // 객체 instansof type -> 참조타입이면 true 반환
        //부모타입 객체가 모두 자식타입으로 강제 형변환이 가능한 거 아님 -> 자식타입 근 한 객체여야 함
        Animal aa = new Animal();
        // Dog dd = (Dog)aa; // 실행시 예외 발생

        if (aa instanceof Dog) {
            Dog dd = (Dog) aa;
            System.out.println("Dog 타입으로 변환 성공");
        } else {
            System.out.println("Dog 타입으로 변환 불가");
        }
    }

}
