package genericCollection.sec05;

public class CompairMain {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<Integer, String>(1,"사과");
        Pair<Integer, String> p2 = new Pair<>(1,"사과");

        boolean result1 = Util.compare(p1, p2);


        if(result1){
            System.out.println("논리적으로 동등한 객체 ");

        }else{
            System.out.println("false");
        }

        Pair<String, String> p3 = new Pair<String, String>("유저1","사과");
        Pair<String, String> p4 = new Pair<>("유저2","사과");

        boolean result3 = Util.compare(p3, p4);


        if(result3){
            System.out.println("논리적으로 동등한 객체 ");

        }else{
            System.out.println("false");
        }

    }

}
