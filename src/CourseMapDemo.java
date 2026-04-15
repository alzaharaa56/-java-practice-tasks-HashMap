import java.util.HashMap;

public class CourseMapDemo {
public static void main(String[] args) {

HashMap<String, String> courseMap = new HashMap<>();

courseMap.put("CS101", "Introduction to Java");
courseMap.put("WD202", "Web Development Fundamentals");
courseMap.put("DB303", "Database Management Systems");
courseMap.put("NET404", "Computer Networking");
courseMap.put("AI505", "Artificial Intelligence");

System.out.println("Initial Course List: " + courseMap);

System.out.println("Course for code CS101: " + courseMap.get("CS101"));

System.out.println("Is 'WD202' in the catalog? " + courseMap.containsKey("WD202"));

courseMap.put("CS101", "Advanced Java Programming");
System.out.println("Updated Course List: " + courseMap);

courseMap.remove("AI505");
System.out.println("After removing AI505: " + courseMap);

System.out.println("Total courses available: " + courseMap.size());
}
}
