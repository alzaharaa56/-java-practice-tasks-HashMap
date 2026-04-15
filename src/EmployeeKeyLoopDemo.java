import java.util.HashMap;

public class EmployeeKeyLoopDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Ahmed ");
        employeeMap.put(102, "Sara ");
        employeeMap.put(103, "Khalid");
        employeeMap.put(104, "Muna");
        employeeMap.put(105, "Salim");

        System.out.println("Full HashMap: " + employeeMap);

        System.out.println("Employee records displayed one by one:");
        for (Integer id : employeeMap.keySet()) {
            String name = employeeMap.get(id);
            System.out.println("ID: " + id + ", Name: " + name);
        }

        employeeMap.put(106, "Fatma ");

        System.out.println("Updated employee records one by one:");
        for (Integer id : employeeMap.keySet()) {
            String name = employeeMap.get(id);
            System.out.println("ID: " + id + ", Name: " + name);
        }
    }
}
