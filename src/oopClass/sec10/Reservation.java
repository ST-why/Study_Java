package oopClass.sec10;

public class Reservation {

    String airPlane;
    String name;
    String from;
    String to;
    int price;
    String seat;

    public Reservation(){
        this("KE1001", "홍길동", "인천", "뉴욕", 1600000, "A38");
    }

    public Reservation(String airPlane, String name, String from, String to, int price, String seat) {
        this.airPlane = airPlane;
        this.name = name;
        this.from = from;
        this.to = to;
        this.price = price;
        this.seat = seat;
    }

    public void showRsvInfo(){
        System.out.println("**항공권 예약 정보**");
        System.out.println("항공기 : " + airPlane);
        System.out.println("예약자: " + name);
        System.out.println("출발지: " + from);
        System.out.println("도착지: " + to);
        System.out.println("금액: " + price);
        System.out.println("좌석번호: " + seat);
    }
}
