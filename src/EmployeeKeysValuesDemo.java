import java.util.HashMap;

public class EmployeeKeysValuesDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Ali Al-Farsi");
        employeeMap.put(102, "Sara Al-Abri");
        employeeMap.put(103, "Khalid Al-Hasani");
        employeeMap.put(104, "Muna Al-Balushi");
        employeeMap.put(105, "Salim Al-Raisi");

        System.out.println("Full Map: " + employeeMap);

        System.out.println("Employee IDs (Keys): " + employeeMap.keySet());

        System.out.println("Employee Names (Values): " + employeeMap.values());

        employeeMap.put(106, "Fatma Al-Saadi");

        System.out.println("Updated Employee IDs (Keys): " + employeeMap.keySet());
        System.out.println("Updated Employee Names (Values): " + employeeMap.values());
    }
}
