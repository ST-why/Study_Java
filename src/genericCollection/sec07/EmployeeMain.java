package genericCollection.sec07;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeMain {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        Employee em1 = new Employee(100, "김사원", 3000);
        Employee em2 = new Employee(101, "이대리", 5000);

        list.add(em1);
        list.add(em2);
        list.add(new Employee(102, "박과장", 7000));

        for (Employee emp : list) {
            System.out.println(emp);
        }

        System.out.println();
        //Iterator 사용해서 출력
        Iterator<Employee> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
