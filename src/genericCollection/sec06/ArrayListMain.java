package genericCollection.sec06;

import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {
        // ArrayList 콜렉션: 제네락 타입이 아닌 경우
        ArrayList list = new ArrayList();

        // 리스트 항목 추가: add();
        list.add(100);
        list.add("하나");
        list.add(7.7);
        list.add("자바");
        list.add("홍길동");

//        for (Object li : list) {
//            System.out.println(li);
//        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("");

        // 리스트 항목 추가2 : add(idx, e) -> ArrayList에 항목추가 매개변수로 전달된 idx위치에 추가
        list.add(0, "변경");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("");

        //리스트 항목삭제
        list.remove(1); // 1번 인덱스 항목 삭제
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("");

        //리스트에 특정 항목이 포함되어 있는지의 여부 반환: 있으면 true, 없으면 false
        System.out.println(list.contains("홍길동"));

        if (list.contains("이몽룡")) {
            System.out.println("이몽룡은 없습니다");
        }else {
            System.out.println(" 이몽룡을 추가합니다.");
            list.add(1, "이몽룡");
            System.out.println("\n 추가한 리스트 ");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

        }



    }

}
