package genericCollection.sec06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("단어를 입력하세요: ");
            list.add(i, sc.nextLine());
        }

        System.out.println("----------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        String tmp = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (tmp.length() <= list.get(i).length()) {
                tmp = list.get(i);
            }
        }
        System.out.println("\n가장 긴 단어는: " + tmp);
        System.out.println("가장 긴 단어의 길이는: " + tmp.length());

        sc.close();
    }

}
