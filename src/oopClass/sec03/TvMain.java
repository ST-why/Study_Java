package oopClass.sec03;

import java.util.Scanner;

// class 접근제한 생략: default(동일 페키지 내에서 접근 가능)
class Tv {

    String color;
    boolean power;
    int channel;

    // 기능

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

public class TvMain {

    public static void main(String[] args) {
        Tv t = new Tv();

        t.color = "black";
        System.out.println("색상: " + t.color);

        System.out.println("전원: " + t.power);
        t.power();
        System.out.println("전원: " + t.power);

        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은: " + t.channel);
        t.channelUp();
        System.out.println("현재 채널은: " + t.channel);
    }
}
