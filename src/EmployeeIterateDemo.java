import java.util.HashMap;
import java.util.Map;

public class EmployeeIterateDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Ali Al-Farsi");
        employeeMap.put(102, "Sara Al-Abri");
        employeeMap.put(103, "Khalid Al-Hasani");
        employeeMap.put(104, "Muna Al-Balushi");
        employeeMap.put(105, "Salim Al-Raisi");

        System.out.println("Full HashMap: " + employeeMap);

        System.out.println("Iterating through records:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        employeeMap.put(106, "Fatma Al-Saadi");

        System.out.println("Iterating through updated records:");

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
