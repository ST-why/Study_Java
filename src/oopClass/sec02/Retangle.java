package oopClass.sec02;

import java.util.Scanner;

public class Retangle {

    // 멤버 변수
    int width;
    int height;
    //멤버 메서드 - width/heightㅇ[ 값 저장하기 위 메하 메서드


    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("가로 길이 입력:");
        this.width = input.nextInt();
        System.out.println("세로 길이 입력:");
        this.height = input.nextInt();
        input.close();
    }

    public void area() {
        System.out.println("사각형 면접: " + (this.width * this.height));
    }


}