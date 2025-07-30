package oopInheritance.sec04;

public class EmpMain {

    public static void main(String[] args) {
        // 서브 클래스의 인스턴스 (객체) 생성하면서
        // 서브 클래스의 생성자에게 안슈 전달
        // 슈퍼 클래스가 필요한 인수도 같이 전달하고 서브 클래스의 생성자에서 부모클래스로 전달하도록 구현

        Manager mg = new Manager("1234", "홍길동", "다자인", "팀장");

        //자식 클래스 인스턴스 출력
        //toString 오버라읻ㅇ 함
        System.out.println(mg);
    }

}
