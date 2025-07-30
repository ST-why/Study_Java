package oopClass.sec15;

public class PersonMain {

    public static void main(String[] args) {
        // final 필드 사용
        Person p1 = new Person("2222-2312", "홍길동", "tmp");

        System.out.println(p1.nation);
        System.out.println(p1.name);
        System.out.println(p1.ssn);
        p1.name = "을지문덕";
    }

}
