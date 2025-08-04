package genericCollection.sec04;

public class Util {

    // 멤버 메소드 추가: 제네릭 타입 메소드
    // <T>: 파팁파리미터(메소드가 제네릭이라는 걸 명시함)
    // Box<T>: 반환타입
    public static  <T> Box<T>  boxing(T t) {
        Box<T> box = new Box<>();
        box.setObj(t);
        return box;

    }
}
