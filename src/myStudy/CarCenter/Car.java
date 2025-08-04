package myStudy.CarCenter;

public class Car {

    private String carName;
    private String carNumber;
    private int carYear;

    public Car() {}

    public Car(String carName, String carNumber, int carYear) {
        this.carName = carName;
        this.carNumber = carNumber;
        this.carYear = carYear;
    }

    public void move() {
        System.out.println("자동차가 움직입니다.");
    }

    @Override
    public String toString() {
        return "자동차 이름: "+ carName + "| 자동차 번호: " + carNumber + "| 자동차 연식: " + carYear;
    }

}
