/**
 * Created by ZAISMIT - EVYNET
 **/
public class facade_file {
    public static void main(String[] args) {
        my_array_list employees = new my_array_list();

        employees.add("alex");
        employees.add("olga");
        employees.add("valery");
        employees.add("valery2");
        employees.remove("alex");

        for (int i = 0; i < employees.getSize(); i = i + 1) {
            System.out.println(employees.get(i));
        }
    }
}
