package genericCollection.sec06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListMain {

    public static void main(String[] args) {
        // Arrays 클랫스 asList메소드: 초기화된 List 생성
        List<String> list1 = Arrays.asList("홍길동", "이몽룡", "성춘향");
        for (String name : list1) {
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(10,200,300);
        for (Integer name : list2) {
            System.out.println(name);
        }


    }

}
