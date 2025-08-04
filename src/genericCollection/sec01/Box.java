package genericCollection.sec01;

public class Box {

    // 필드 1개와 getter/setter가 필요한 클래스
    // 어떤 타입의 필드인지는 결정하지 않고 모든 타입의 필드 사용할 수 있도 클래스를 구성
    // 모든타입을 포함하는 클래스가 Object
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
