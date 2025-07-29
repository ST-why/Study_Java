package oopClass.sec04;

import java.text.NumberFormat;
import java.util.Scanner;

public class Product {

    private String prdName;
    private int prdPrice;
    private int prdSold;
    private int prdStock;
    private int soldPrice;
    private int remainPrice;
    NumberFormat nf = NumberFormat.getInstance();

    public void inputPrdInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("****상품 정보 입력****");

        System.out.print("상품명: ");
        prdName = sc.nextLine();

        System.out.print("가격: ");
        prdPrice = sc.nextInt();

        System.out.print("판매 수량: ");
        prdSold = sc.nextInt();

        System.out.print("재고 수량: ");
        prdStock = sc.nextInt();
    }

    public void showPrdInfo() {
        System.out.println("****상품 정보 출력****");
        System.out.println("상품명: " + prdName);

        String prdPricestr = nf.format(prdPrice);

        System.out.println("가격: " + prdPricestr);
        System.out.println("판매 수량: " + prdSold);
        System.out.println("재고 수량: " + prdStock);
        showSalesAmount();
        showStockAmount();
    }

    public void showSalesAmount() {
        soldPrice = prdPrice * prdSold;
        String money1 = nf.format(soldPrice);
        System.out.println("매출액: " + money1);
    }

    public void showStockAmount() {
        remainPrice = prdStock * prdPrice;
        String money2 = nf.format(remainPrice);
        System.out.println("재고액: " + money2);

    }

}
