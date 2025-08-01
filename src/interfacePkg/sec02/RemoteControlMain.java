package interfacePkg.sec02;

public class RemoteControlMain {

    public static void main(String[] args) {
        // 인터페이스 활용 객체와 통신
        RemoteControl rc = null;

        //Television 객체 활용
        rc = new TeleVison();
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);

        System.out.println("============================================");

        RemoteControl au = new Audio();
        au.turnOn();
        au.turnOff();
        au.setVolume(50);
        au.setMute(true);
        au.setMute(false);

        RemoteControl.changeBattery();

    }

}
