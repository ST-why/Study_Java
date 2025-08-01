package myStudy;

public class Chicken extends Animal implements Fly {


    @Override
    public void sound() {
        System.out.println("꼭끼오");
    }

    @Override
    public void fly() {
        System.out.println("닭이 날기 시작합니다");
    }


}
