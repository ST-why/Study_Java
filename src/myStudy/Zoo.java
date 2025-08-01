package myStudy;

import oopInheritance.pack1.B;

public class Zoo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

//        dog.sound();
//        dog.move();
//
//        bird.sound();
//        bird.fly();
//
//        chicken.sound();
//        chicken.move();

        animalsound(dog);
        animalsound(bird);
        animalsound(chicken);
        flymove(bird);
        flymove(chicken);

        Animal dog2 = new Dog();
        Fly bird2 = new Bird();
        Animal chicken2 = new Chicken();

        dog2.sound();
        dog2.move();

        bird2.fly();

        chicken2.sound();
        chicken2.move();


    }

    private  static  void animalsound(Animal animal){
        System.out.println("동물이 웁니다");
        animal.sound();
        animal.move();
    }

    private static void flymove(Fly fly){
        System.out.println("나는 동물");
        fly.fly();
    }

}
