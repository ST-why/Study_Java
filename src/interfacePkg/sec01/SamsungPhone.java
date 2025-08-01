package interfacePkg.sec01;

public class SamsungPhone implements ISmartPhone {

    // 클래스가 interface를 구현한다고 설정되면 (implements) interface의 모든 정의된 메서드를 정의해야 함
    // 클래스이므로 클래스가 갖는 필드, 메서드 추가

    String name;

    public SamsungPhone() {
        this.name = "삼성폰";
    }

    @Override
    public void sendCall() {
        System.out.println(name + "으로 전화를 겁니다");
    }

    @Override
    public void reciveCall() {

    }

    @Override
    public void sendSMS() {

    }

    @Override
    public void reciveSMS() {

    }



}
