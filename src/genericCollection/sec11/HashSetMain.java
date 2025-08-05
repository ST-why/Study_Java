package genericCollection.sec11;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

    public static void main(String[] args) {
        // Member class 인스턴스 HashSet에 저장
        Set<Member> set = new HashSet<Member>();
        // 동일값이 필드에 저장되지만 객체의 참조 주소가 다르기 때문에 두개의 객체로 봄
        set.add(new Member("홍길동", 21));
        set.add(new Member("홍길동", 21));

        System.out.println("총 객체수: " + set.size());

        Set<Member2> set1 = new HashSet<>();
        // 동일값이 필드에 저장되지만 객체의 참조 주소가 다르기 때문에 두개의 객체로 봄
        set1.add(new Member2("홍길동", 21));
        set1.add(new Member2("홍길동", 21));


        System.out.println("총 객체수: " + set1.size());


    }

}
