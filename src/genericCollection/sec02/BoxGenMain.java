package genericCollection.sec02;

public class BoxGenMain {

    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.setTobj("낭만고양이");
        System.out.println(box.getTobj());

        // 정수형 Box 인스턴스 생성 -> Integer 클래스 사용
        Box<Integer> box2 = new Box<>();
        box2.setTobj(1);
        System.out.println(box2.getTobj());
    }

}
