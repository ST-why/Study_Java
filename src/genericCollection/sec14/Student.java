package genericCollection.sec14;

import oopInheritance.sec09.Parent;

public class Student {

    private int stdNo;
    private String stdName;

    public Student(int stdNo, String stdName) {
        this.stdNo = stdNo;
        this.stdName = stdName;
    }

    public int getStdNo() {
        return stdNo;
    }

    public void setStdNo(int stdNo) {
        this.stdNo = stdNo;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    @Override
    public int hashCode() {
        System.out.println(stdName.hashCode()+stdNo);
        return  stdName.hashCode()+stdNo;
    } // 해쉬 코드 값 추력 및 반환

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            return std.stdName.equals(stdName) && (std.stdNo == stdNo);
        }else{
            return false;
        }
    }
}
