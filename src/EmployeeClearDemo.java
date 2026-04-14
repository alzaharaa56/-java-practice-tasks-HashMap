import java.util.HashMap;

public class EmployeeClearDemo {
public static void main(String[] args) {

HashMap<Integer, String> employeeMap = new HashMap<>();

employeeMap.put(101, "Ali Al-Farsi");
employeeMap.put(102, "Sara Al-Abri");
employeeMap.put(103, "Khalid Al-Hasani");
employeeMap.put(104, "Muna Al-Balushi");
employeeMap.put(105, "Salim Al-Raisi");

System.out.println("Employee Records: " + employeeMap);
System.out.println("Number of records before clearing: " + employeeMap.size());

employeeMap.clear();

System.out.println("Employee Records after clearing: " + employeeMap);
System.out.println("Number of records after clearing: " + employeeMap.size());
System.out.println("All records have been successfully removed.");
}
}
