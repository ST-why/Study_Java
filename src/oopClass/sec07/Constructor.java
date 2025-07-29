package oopClass.sec07;

public class Constructor {
    // 멤버 변수
    private int x;
    private int y;

    // 생성자: 클래스 이름과 동일한 메소드, 반환타입 없음
    // 겍체: 생성될 때 한번만 호출 가능
    // 생성자 역할: 멤버변수 값 초기화

    public Constructor(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void show(){
        System.out.println("x = " + x + " y = " + y);
    }


}
