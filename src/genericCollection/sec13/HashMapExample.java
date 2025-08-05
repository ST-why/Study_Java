package genericCollection.sec13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        //1. 사용자로부터 영문단어 = 한글단어 형태의 entry를 입력받아 HashMap에 저장하는 로직 구현
        Scanner sc = new Scanner(System.in);
        Map<String, String> word = new HashMap<>();

        System.out.println("저장할 단어를 입력하세요 ex) 영어, 한글");

        for (int i = 0; i < 5; i ++){
            word.put(sc.next(), sc.next());
        }

        System.out.println("==============================");
        System.out.println("입력한 단어입니다.");
        for(String s : word.keySet()){
            System.out.println(s + ": " + word.get(s));
        }

        //2. HashMap에 입력된 영단어를 검색할 수 있는 로직 구현
        // exit 입력되면 종류
        // 없는단어 검색 시 "사전에 없는 단어입니다" 출력

        while(true){
            System.out.print("찾고 싶은 단어는? ");
            String s = sc.next();
            if(word.containsKey(s)){
                System.out.println(word.get(s));
            } else if (s.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            } else {
                System.out.println(s + "는 없는 단어입니다.");
            }
        }
        sc.close();
    }

}
