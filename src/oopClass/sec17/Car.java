package oopClass.sec17;

public class Car {
    //private 멤버 필드이므로 인스턴스통한 접근 불가
    private int speed;
    private boolean stop;

    //private 멤버 필드에 접근하려면 클래스 내에서 접해야 함
    //private 멤버필드의 값을 수정하기위한 setter와 멤버필드 값을 가져오기위한 getter 필요


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed<0){
            this.speed = 0;
        }else {
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}
