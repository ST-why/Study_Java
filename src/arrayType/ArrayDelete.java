package arrayType;

public class ArrayDelete {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        // num의 원소값을 유지하고 크기는 10인 배열이 필요해 짐
        int[] newNum = new int[10];

        //num 원소값 newNum에 저장
        for (int i = 0; i < num.length; i++) {
            newNum[i] = num[i];
        }

        for (int i = 0; i < newNum.length; i++) {
            System.out.print(newNum[i] + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        num = newNum; //num newNum은 같은 객체 참조
        // 기존에 num이 참조하고 있던 배열은 참조를 잃어버리게 됨 - 가비지 콜렉터가 메모리 할당을 풀어버림

        //num = null;
        // 기존에 num이 참조하고 있던 배열은 참조를 잃어버리게 됨 - 가비지 콜렉터가 메모리 할당을 풀어버림

        System.out.println("\n");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        num = null; // num이 참조하는 배열의 참조값 num에서는 null로 변경 - 어느 객체 참조하지 않음
        // 단, newNum이 크기가 10인 배열 참조하므로 그대로 유지되어야 함

        System.out.println(num); // null


    }

}
