package genericCollection.sec08;

public class Product {

    private String name;
    private int price;
    private int stuff;

    public Product(String name, int price, int stuff) {
        this.name = name;
        this.price = price;
        this.stuff = stuff;
    }

    @Override
    public String toString() {
        return "제품: " + name + ", 가격: " + price + ", 수량: " + stuff;
    }


}
