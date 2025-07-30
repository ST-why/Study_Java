package oopInheritance.sec03;

public class EmployeeTostring {

    private String empNo;
    private String name;
    private String part;

    public EmployeeTostring(String empNo, String name, String part) {
        this.empNo = empNo;
        this.name = name;
        this.part = part;
    }

    @Override
    public String toString() {
        return empNo + "\t |" + name + "\t |" + part;
    }


}
