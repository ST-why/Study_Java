package oopInheritance.sec08;

public class SportsCar extends MyCar { // 클래스가 final이면 상속 불가능

    @Override
    public void speedUp() {
        speed += 10;
    }

    @Override
    public void stop() { // Mycar 클래스에서 stop 메소드를 final로 지정함
        System.out.println("SportsCar stop");
        speed = 0;
    }

}
