package oopClass.sec08;

// 사용자 정의 클래스 생성: 개발자가 필요한 변수 (필드/속성), 함수(메서드)저으이
// 데이터를 다루기 위한 변수: 멤버변수
// 데이터를 조작하기 위한, 기능을 수행 하기 위한 함수: 멤버 메소드

public class Car {
    // 멤버변수, 데이터
    private String carNo; // 차량 번호
    private String carName; // 차종
    private String carMaker; // 제조사
    private int carYear; // 연식
    private int carCC; // 배기량
    // private: 접근제한자, 클랴스 외부에서 변수가 있는 모르게 숨겨놓는 것(데이터 은닉)

    public Car(String carNo, String carName, String carMaker, int carYear, int carCC) {
        this.carNo = carNo;
        this.carName = carName;
        this.carMaker = carMaker;
        this.carYear = carYear;
        this.carCC = carCC;
    }

    public void setCarInfo(String no, String name, String maker, int year, int cc) {
        carNo = no; // private 멤버션수 : 클래스 내부에서는 접근 가능
        carName = name;
        carMaker = maker;
        carYear = year;
        carCC = cc;
    }

    // (2)멤버 변수 값을 출력하는 메소드
    public  void showCarInfo(){
        System.out.println("차량번호 : " + carNo);
        System.out.println("차종 : " + carName);
        System.out.println("제조사 : " + carMaker);
        System.out.println("차량연식 : " + carYear);
        System.out.println("차량배기량 : " + carCC);
    }
}
