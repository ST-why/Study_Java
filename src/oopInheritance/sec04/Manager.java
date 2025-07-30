package oopInheritance.sec04;

public class Manager extends Emplyoee {

    private String position;

    public Manager(String empNo, String name, String part, String position) {
        super(empNo, name, part);
        this.position = position;
    }

    @Override
    public String toString() {
        // super 레퍼런스: 부모 클래스를 참조할 떄 사용
        return super.toString() + "\t |" + position;
    }


}
