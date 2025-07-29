package oopClass.sec09;

public class Book {

    String title;
    String author;
    int price;

    public Book(){
        //this(): 생성자에서 다른 생성자 호출할 수 있는 메서드
        this("화장실", "나도", 20000);

    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void show() {
        System.out.println("도서명 = " + title);
        System.out.println("저자명 = " + author);
        System.out.println("가격 = " + price);
    }
}
