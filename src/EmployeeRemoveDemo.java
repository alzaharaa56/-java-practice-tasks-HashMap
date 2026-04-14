import java.util.HashMap;

public class EmployeeRemoveDemo {
public static void main(String[] args) {

HashMap<Integer, String> employeeMap = new HashMap<>();

employeeMap.put(101, "Ali Al-Farsi");
employeeMap.put(102, "Sara Al-Abri");
employeeMap.put(103, "Khalid Al-Hasani");
employeeMap.put(104, "Muna Al-Balushi");
employeeMap.put(105, "Salim Al-Raisi");

System.out.println("Initial Records: " + employeeMap);

employeeMap.remove(102);
System.out.println("After removing ID 102: " + employeeMap);

employeeMap.remove(104);
System.out.println("After removing ID 104: " + employeeMap);

employeeMap.remove(999);
System.out.println("After attempting to remove non-existent ID 999: " + employeeMap);
}
}
