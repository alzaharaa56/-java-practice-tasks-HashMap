import java.util.HashMap;

public class DepartmentManagerDemo {
    public static void main(String[] args) {

        HashMap<String, String> departmentManagers = new HashMap<>();

        departmentManagers.put("IT", "Ahmed ");
        departmentManagers.put("Human Resources", "Sara ");
        departmentManagers.put("Finance", "Khalid ");
        departmentManagers.put("Marketing", "Muna ");
        departmentManagers.put("Operations", "Salim ");

        System.out.println("Initial Department Records: " + departmentManagers);

        System.out.println("Manager of IT Department: " + departmentManagers.get("IT"));
        System.out.println("Does the Finance department exist? " + departmentManagers.containsKey("Finance"));

        departmentManagers.put("Marketing", "Muna ");
        System.out.println("Updated Department List: " + departmentManagers);

        departmentManagers.remove("Operations");
        System.out.println("After removing Operations: " + departmentManagers);

        System.out.println("Total departments managed: " + departmentManagers.size());
    }
}
