import java.util.HashMap;

public class EmployeeCompareUpdateDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Ali Al-Farsi");
        employeeMap.put(102, "Sara Al-Abri");
        employeeMap.put(103, "Khalid Al-Hasani");
        employeeMap.put(104, "Muna Al-Balushi");
        employeeMap.put(105, "Salim Al-Raisi");

        System.out.println("Current HashMap: " + employeeMap);

        System.out.println("Current value for ID 101: " + employeeMap.get(101));
        employeeMap.put(101, "Ahmed Al-Zadjali");
        System.out.println("New updated value for ID 101: " + employeeMap.get(101));

        System.out.println("Current value for ID 104: " + employeeMap.get(104));
        employeeMap.put(104, "Muna Al-Said");
        System.out.println("New updated value for ID 104: " + employeeMap.get(104));

        System.out.println("Full HashMap after all updates:");
        System.out.println(employeeMap);
    }
}
