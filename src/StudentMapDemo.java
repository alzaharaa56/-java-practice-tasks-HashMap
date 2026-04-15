import java.util.HashMap;

public class StudentMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(2021001, "Ahmed ");
        studentMap.put(2021002, "Sara ");
        studentMap.put(2021003, "Khalid ");
        studentMap.put(2021004, "Muna ");
        studentMap.put(2021005, "Salim ");

        System.out.println("Initial Student Records: " + studentMap);

        System.out.println("Student with ID 2021001: " + studentMap.get(2021001));

        System.out.println("Does ID 2021003 exist? " + studentMap.containsKey(2021003));

        studentMap.put(2021004, "Muna Al-Said");
        System.out.println("Updated Records: " + studentMap);

        studentMap.remove(2021005);
        System.out.println("After removing ID 2021005: " + studentMap);

        System.out.println("Total students remaining: " + studentMap.size());
    }
}
