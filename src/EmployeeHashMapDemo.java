import java.util.HashMap;

public class EmployeeHashMapDemo {
public static void main(String[] args) {

HashMap<Integer, String> employeeMap = new HashMap<>();

employeeMap.put(1001, "Ali Al-Abri");
employeeMap.put(1002, "Sana Al-Balushi");
employeeMap.put(1003, "Khalid Al-Raisi");
employeeMap.put(1004, "Muna Al-Zadjali");
employeeMap.put(1005, "Salim Al-Harthy");

System.out.println("Original Employee Records:");
System.out.println(employeeMap);

employeeMap.put(1006, "Fatma Al-Saadi");

System.out.println("Updated Employee Records:");
System.out.println(employeeMap);
}
}
