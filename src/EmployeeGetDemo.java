import java.util.HashMap;

public class EmployeeGetDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Ali Al-Farsi");
        employeeMap.put(102, "Sara Al-Abri");
        employeeMap.put(103, "Khalid Al-Hasani");
        employeeMap.put(104, "Muna Al-Balushi");
        employeeMap.put(105, "Salim Al-Raisi");

        System.out.println("All Employee Records: " + employeeMap);

        String employee1 = employeeMap.get(102);
        System.out.println("Retrieved Employee (ID 102): " + employee1);

        String employee2 = employeeMap.get(105);
        System.out.println("Retrieved Employee (ID 105): " + employee2);
    }
}
