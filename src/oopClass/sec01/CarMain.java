package oopClass.sec01;

public class CarMain {

    public static void main(String[] args) {
        // 사용자 정의 클래스 Car를 사용
        // 1. Car 클래스 객체 생성
        // 2. 생성된 객체 통해 멤버 변수 멤버 메소드 사용 (사용 접근제한에 따라 다름)
        // Car 클래스는 현재 CarMain과 같은 클래스에 있음, import 없이 사용 가능

        Car car = new Car(); // car 인스턴스 생성

        // 객체 통해서 멤버변수 또는 멤버 메소드 사용
        // carNo는 private: 클래스 외부에서 직접 접근 불가능 ex) car.carNo = "123더1234" 불가능

        // 객체 통해서 public 메소드 호출
        car.setCarInfo("21버1234", "벤츠S클래스", "벤츠", 2025, 4000); // car 참조변수가 참조하고 있는 객체의 멤버변수에 값이 저장됨
        car.showCarInfo(); // car 참조변수가 참조하고 있는 객체의 멤버 변수 값을 출력


    }

}
