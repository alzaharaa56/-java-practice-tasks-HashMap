import java.util.HashMap;

public class EmployeeUpdateDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Ali Al-Farsi");
        employeeMap.put(102, "Sara Al-Abri");
        employeeMap.put(103, "Khalid Al-Hasani");
        employeeMap.put(104, "Muna Al-Balushi");
        employeeMap.put(105, "Salim Al-Raisi");

        System.out.println("Original Records: " + employeeMap);

        employeeMap.put(102, "Sara Al-Said");

        System.out.println("Updated Records (First Update): " + employeeMap);
        System.out.println("Verified Value for ID 102: " + employeeMap.get(102));

        employeeMap.put(105, "Salim Al-Harthy");

        System.out.println("Updated Records (Second Update): " + employeeMap);
        System.out.println("Verified Value for ID 105: " + employeeMap.get(105));
    }
}

