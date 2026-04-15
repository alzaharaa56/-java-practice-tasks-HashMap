import java.util.HashMap;

public class EmployeeEmptyDemo {
public static void main(String[] args) {

HashMap<Integer, String> employeeMap = new HashMap<>();

System.out.println("Is the HashMap empty before adding records? " + employeeMap.isEmpty());

employeeMap.put(101, "Ali");
employeeMap.put(102, "Sara");
employeeMap.put(103, "Khalid");
employeeMap.put(104, "Muna");
employeeMap.put(105, "Salim");

System.out.println("All Employees: " + employeeMap);

System.out.println("Is the HashMap empty after adding records? " + employeeMap.isEmpty());

employeeMap.clear();

System.out.println("HashMap after clear(): " + employeeMap);

System.out.println("Is the HashMap empty after clearing? " + employeeMap.isEmpty());
}
}
