import java.util.HashMap;

public class EmployeeMapDemo  {
    public static void main(String[] args) {

        HashMap<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1001, "Ahmed ");
        employeeMap.put(1002, "Sara ");
        employeeMap.put(1003, "Khalid ");
        employeeMap.put(1004, "Muna ");
        employeeMap.put(1005, "Salim ");

        System.out.println("Initial Employee Records: " + employeeMap);

        System.out.println("Employee with ID 1001: " + employeeMap.get(1001));

        System.out.println("Does ID 1003 exist? " + employeeMap.containsKey(1003));

        employeeMap.put(1004, "Muna Al-Said");
        System.out.println("Updated Records: " + employeeMap);

        employeeMap.remove(1005);
        System.out.println("After removing ID 1005: " + employeeMap);

        System.out.println("Total employees remaining: " + employeeMap.size());
    }
}
