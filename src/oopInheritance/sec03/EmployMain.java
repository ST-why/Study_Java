package oopInheritance.sec03;

public class EmployMain {

    public static void main(String[] args) {
        EmployeeTostring et = new EmployeeTostring("emp12", "홍길동", "마케팅");
        EmployeeTostring et2 = new EmployeeTostring("emp123", "박무리", "개발");

        System.out.println(et);
        System.out.println(et2);
    }

}
