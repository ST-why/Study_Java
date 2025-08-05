package oopExcetion.sec05;

public class Throws {

    public static void main(String[] args) {
        //메소드에서 호출한 곳으로 예외 떠넘기기(Throws 구문)
//        findClass(); // 메소드에 throws 구문이 있는 경우 try ~ catch 구문을 반드시 사용 해야 한다.
        try{
            findClass();
        }catch(ClassNotFoundException e){
            System.out.println("메소드에서 throws로 떠넘긴 예외는 메소드 호출시 반드시 처리해야 .");
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class class1 = Class.forName("java.lang.String2");
    }

}
