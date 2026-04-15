import java.util.HashMap;

public class CourseTrainerDemo {
    public static void main(String[] args) {

        HashMap<String, String> courseTrainers = new HashMap<>();

        courseTrainers.put("Java Programming", "Dr. Liam");
        courseTrainers.put("Web Development", "Sarah ");
        courseTrainers.put("Data Science", "Noor");
        courseTrainers.put("Cyber Security", "Abdullah ");
        courseTrainers.put("Mobile App Design", "Sara");

        System.out.println("Course List: " + courseTrainers);

        System.out.println("Trainer for Java Programming: " + courseTrainers.get("Java Programming"));

        System.out.println("Is 'Data Science' offered? " + courseTrainers.containsKey("Data Science"));

        courseTrainers.put("Web Development", "Emma ");
        System.out.println("Updated Course List: " + courseTrainers);

        courseTrainers.remove("Mobile App Design");
        System.out.println("After removing Mobile App Design: " + courseTrainers);

        System.out.println("Total active courses: " + courseTrainers.size());
    }
}
