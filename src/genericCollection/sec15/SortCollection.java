package genericCollection.sec15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortCollection {

    public static void main(String[] args) {
        //콜렉션 객체에 사용 가능한 sort, reverse 메소드
        ArrayList<String> myList = new ArrayList<>();
        myList.add("트랜스포머");
        myList.add("아이언맨");
        myList.add("스파이더맨");
        myList.add("스타워즈");
        myList.add("터미네이터");
        myList.add("아바타");

        System.out.print("리스트 순서: "); // 입력순서를 보장
        for (String s : myList) {
            System.out.print(s + " ");
        }

        System.out.print("\n오름차순 정럴: "); // Collection 객체에 대한 정렬 static 메소드 sort(콜렉션)
        Collections.sort(myList);
        printList(myList);



        System.out.print("\n내림차슌 정럴: "); // Collection 객체에 대한 정렬 static 메소드 sort(콜렉션)
        Collections.reverse(myList);
        printList(myList);

        System.out.println(myList.get(1));


    }

    static void printList(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String ele = it.next();
            String sep;
            if (it.hasNext()) {
                sep = "->";
            } else {
                sep = "\n";
            }
            System.out.print(ele + sep);
        }
    }

}
