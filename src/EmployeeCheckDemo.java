import java.util.HashMap;

public class EmployeeCheckDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Ali Al-Farsi");
        employeeMap.put(102, "Sara Al-Abri");
        employeeMap.put(103, "Khalid Al-Hasani");
        employeeMap.put(104, "Muna Al-Balushi");
        employeeMap.put(105, "Salim Al-Raisi");

        System.out.println("Employee Records: " + employeeMap);

        boolean idExists = employeeMap.containsKey(103);
        System.out.println("Does ID 103 exist? " + idExists);

        boolean idMissing = employeeMap.containsKey(999);
        System.out.println("Does ID 999 exist? " + idMissing);

        boolean nameExists = employeeMap.containsValue("Sara Al-Abri");
        System.out.println("Does 'Sara Al-Abri' exist? " + nameExists);

        boolean nameMissing = employeeMap.containsValue("John Doe");
        System.out.println("Does 'John Doe' exist? " + nameMissing);

    }
}
