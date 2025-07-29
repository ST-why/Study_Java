package oopClass.sec10;

public class ReservationEx {

    public static void main(String[] args) {
        Reservation re = new Reservation();
        re.showRsvInfo();

        Reservation re2 = new Reservation("boing747", "박순자", "런던", "뉴욕", 1200000, "B23");
        re2.showRsvInfo();


    }
}
