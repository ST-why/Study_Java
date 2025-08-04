package genericCollection.sec08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.management.StringValueExp;

public class LinkedListEx {

    public static void main(String[] args) {
        // 성능비교
        // List = ArrayList
        // List = LinkedList
        // ArrayList = ArrayList
        // ArrayList = LinkedList

        List<String> ListArrList = new ArrayList<>();
        List<String> listLinkedList = new LinkedList<>();

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // 작업
        long startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            ListArrList.add(0, String.valueOf(i));
        }

        long endTime = System.nanoTime();
        System.out.println("ListArrList 소요시간: " + (endTime - startTime) + "ns");

        // 작업
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            listLinkedList.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.println("listLinkedList 소요시간: " + (endTime - startTime) + "ns");

        // 작업
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.println("arrayList 소요시간: " + (endTime - startTime) + "ns");

        // 작업
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.println("linkedList 소요시간: " + (endTime - startTime) + "ns");

    }

}
