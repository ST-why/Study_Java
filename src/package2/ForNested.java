package package2;

public class ForNested {

    public static void main(String[] args) {
        for (int n = 0; n <= 9; n++) {
            for (int dan = 2; dan <= 9; dan++) {
                System.out.print(dan + " x " + n + " = " + dan * n + '\t');
            }
            System.out.println();

        }
    }

}
