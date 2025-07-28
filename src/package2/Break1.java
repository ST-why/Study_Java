package package2;

public class Break1 {

    public static void main(String[] args) {
        int i = 0;

        while (true) {
            if (i >= 20) {
                break;
            }
            System.out.println(i);
            i += 3;
        }
    }

}
