package genericCollection.sec06;

import java.util.ArrayList;
import java.util.List;

public class ListGenMain {

    public static void main(String[] args) {
        // 제네릭타입으로 ArrayList 사용 -> List interface 활용
        List<String> list = new ArrayList<>();

        list.add("java");
        list.add("DataBase");
        list.add("HTML");
        list.add("java"); // 중복값 저장
        //list.add(100); // String으로 저장 타입 구체화 했으므로 정수형이나 다른 타입으로는 추가 안됨
        System.out.println("총 객체 수: " + list.size());

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();
        list.remove(1);

        for (String s : list) {
            System.out.println(s);
        }

        list.add("MultiMedia");
        //list.get(i)반환 값은 문자열: length()사용 가능
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+ " : " + list.get(i).length());
        }

        for (String s : list) {
            System.out.println(s.length());
        }



    }


}
