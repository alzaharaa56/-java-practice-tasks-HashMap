import java.util.HashMap;

public class StudentMarksDemo {
    public static void main(String[] args) {

        HashMap<Integer, Integer> studentMarks = new HashMap<>();

        studentMarks.put(202101, 85);
        studentMarks.put(202102, 92);
        studentMarks.put(202103, 78);
        studentMarks.put(202104, 88);
        studentMarks.put(202105, 95);

        System.out.println("All Student Records: " + studentMarks);

        System.out.println("Mark for student 202102: " + studentMarks.get(202102));

        System.out.println("Does student ID 202103 exist? " + studentMarks.containsKey(202103));

        studentMarks.put(202104, 90);
        System.out.println("Updated Marks: " + studentMarks);

        studentMarks.remove(202105);
        System.out.println("Records after removal: " + studentMarks);

        System.out.println("Total student records remaining: " + studentMarks.size());
    }
}
