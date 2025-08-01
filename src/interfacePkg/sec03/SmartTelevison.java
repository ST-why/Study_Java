package interfacePkg.sec03;

public class SmartTelevison implements RemoteControl, ISearchable {

    private int volume;

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다");
    }

    @Override
    public void turnOn() {
        System.out.println("스마트 TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트 TV를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > interfacePkg.sec02.RemoteControl.MAX_VOLUME){
            this.volume = interfacePkg.sec02.RemoteControl.MAX_VOLUME;
        }else if (volume <  interfacePkg.sec02.RemoteControl.MIN_VOLUME) {
            this.volume = interfacePkg.sec02.RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 Tv 볼륨: " + this.volume);
    }
}
