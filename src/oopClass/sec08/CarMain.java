package oopClass.sec08;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car("31사5932", "포르쉐911", "포르쉐", 2032, 5000); // car 인스턴스 생성

        // 객체 통해서 멤버변수 또는 멤버 메소드 사용
        // carNo는 private: 클래스 외부에서 직접 접근 불가능 ex) car.carNo = "123더1234" 불가능

        // 객체 통해서 public 메소드 호출
        car.showCarInfo();
        car.setCarInfo("21버1234", "벤츠S클래스", "벤츠", 2025, 4000); // car 참조변수가 참조하고 있는 객체의 멤버변수에 값이 저장됨
        car.showCarInfo(); // car 참조변수가 참조하고 있는 객체의 멤버 변수 값을 출력


    }

}
