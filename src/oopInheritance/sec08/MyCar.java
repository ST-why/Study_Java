package oopInheritance.sec08;
//final
public  class MyCar {

    public int speed;

    public void speedUp() {
        speed += 1;
    }

    public void speedDown() {
        speed -= 1;
    }
//final
    public  void stop() { // final은 재정의 불가능
        System.out.println("차를 멈춤");
        speed = 0;
    }

}
