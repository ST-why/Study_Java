package oopInheritance.sec07;

public class Automobile extends Car {

    private String autoManual;

    public Automobile(String carNo, String carName, String carMaker, int carYear, String autoManual) {
        super(carNo, carName, carMaker, carYear);
        this.autoManual = autoManual;
    }

    @Override
    public void carDescription(){
        super.carDescription();
        System.out.println("기어 변속: " + this.autoManual);
    }

    @Override
    public String toString() {
        return super.toString() + "\t |" + this.autoManual;
    }

}
