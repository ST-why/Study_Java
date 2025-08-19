package myStudy.study1;

public class Zoo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        SoundAnimal(dog);
        SoundAnimal(cat);
        SoundAnimal(cow);

    }

    private static void SoundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}





