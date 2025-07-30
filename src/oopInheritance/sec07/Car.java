package oopInheritance.sec07;

public class Car {

    private String carNo;
    private String carName;
    private String carMaker;
    private int carYear;

    public Car(String carNo, String carName, String carMaker, int carYear) {
        this.carNo = carNo;
        this.carName = carName;
        this.carMaker = carMaker;
        this.carYear = carYear;
    }

    public void carDescription() {
        System.out.println("차량 번호: " + this.carNo);
        System.out.println("차종: " + this.carName);
        System.out.println("제조사: " + this.carMaker);
        System.out.println("연식: " + this.carYear);
    }

    @Override
    public String toString() {
        return this.carNo + "\t |" + this.carName + "\t |" + this.carMaker + " \t |" + this.carYear;
    }
}
