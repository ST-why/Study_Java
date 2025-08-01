package interfacePkg.sec03;

public class TvMain {

    public static void main(String[] args) {
        SmartTelevison stv = new SmartTelevison();
        stv.turnOn();
        stv.setVolume(4);
        stv.search("ww.naver.com");

        //RemoteControl rc = new SmartTelevison();
        ISearchable se = new SmartTelevison();


    }

}
