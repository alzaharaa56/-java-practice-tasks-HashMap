import java.util.HashMap;

public class EmployeeSizeDemo {
public static void main(String[] args) {

HashMap<Integer, String> employeeMap = new HashMap<>();

employeeMap.put(101, "Ali Al-Farsi");
employeeMap.put(102, "Sara Al-Abri");
employeeMap.put(103, "Khalid Al-Hasani");
employeeMap.put(104, "Muna Al-Balushi");
employeeMap.put(105, "Salim Al-Raisi");

System.out.println("Employee Records: " + employeeMap);

System.out.println("Total number of employees: " + employeeMap.size());

employeeMap.put(106, "Fatma Al-Saadi");

System.out.println("Updated Records: " + employeeMap);

System.out.println("New total number of employees: " + employeeMap.size());
}
}
