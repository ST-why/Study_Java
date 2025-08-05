package genericCollection.sec12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

    public static void main(String[] args) {
        // HashMap 사용 예제
        // HashMap: key의 중복 불가능, value는 중복 가능
        // (key, value) : 타입의 데이터를 다루기 위한 콜렉션
        // key를 통해서 data를 구분함: key의 중복을 허용하지 않기 때문에 중복을 체크할 수 있는 String 타입을 주로 key 사용

        // 아래 map을 통해 학생 이름별 점수를 map collection에 저장
        Map<String, Integer> map = new HashMap<String, Integer>();

        // 저장: put(key, value)
        map.put("홍길동", 90);
        map.put("이몽룡", 80);
        map.put("성춘향", 95);
        map.put("홍길동", 85);

        System.out.println("총 객체수: " + map.size());

        //key에 해당되는 value 반환: get(key)
        System.out.println(map.get("홍길동"));

        // 전체객체 순회 방법 1
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        //keySet 변수 저장
        Set<String> keySet = map.keySet(); // 반환하는 타입 Set: 타입을 구체화 현재 key는 String이므로

        System.out.println("-----------------------");

        // 전체객체 순회 방법 2
        map.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        System.out.println("-----------------------");

        // 전체객체 순회 방법 3: entrySet() 메소드 활용 -> key = value entry를 set 타입으로 반환 메서드
        for(Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("-----------------------");

        System.out.println(map.entrySet());
        // map.get(key): map에 해당 키가 존재하지 않으면 반환값은?
        System.out.println(map.get("변화도")); // null 값이 반환, 오류 발생하지 않음
    }

}
