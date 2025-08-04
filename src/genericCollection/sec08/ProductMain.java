package genericCollection.sec08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {

        List<Product> productList = new LinkedList<>();

        Product phone = new Product("삼성폰", 12000000, 100);
        Product shose = new Product("나이키신발", 150000, 800);
        Product cup = new Product("스타벅스컵", 17000, 1500);

        productList.add(phone);
        productList.add(shose);
        productList.add(cup);

        for (Product product : productList) {
            System.out.println(product);
        }
    }

}
