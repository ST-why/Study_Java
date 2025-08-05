package genericCollection.sec09;

import java.util.List;
import java.util.Vector;

public class VectorBoardMain {

    public static void main(String[] args) {
        // List interface 통해서 Vector 참조
        List<Board> list = new Vector<>();
        //Vector는 ArrayList와 내부 구조 동일 - 사용법 동알
        //단, 쓰레드를 활용하는 경우 동기화 진행을 따로하지 않아도 됨
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목1-1", "내용1-1", "글쓴이1-1"));
        list.add(new Board("제목1-2", "내용1-2", "글쓴이1-2"));
        list.add(new Board("제목1-3", "내용1-3", "글쓴이1-3"));
        list.add(new Board("제목1-4", "내용1-4", "글쓴이1-4"));
        list.add(new Board("제목1-5", "내용1-5", "글쓴이1-5"));

        list.remove(2);
        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board.subject + "\t" + board.content + "\t" + board.writer + "\t");
        }
    }

}
