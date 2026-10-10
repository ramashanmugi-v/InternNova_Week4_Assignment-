import java.util.HashSet;

public class Task3_UniqueCourses {
    public static void main(String[] args) {
        HashSet<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C");
        courses.add("C++");
        courses.add("HTML");
        courses.add("CSS");
        courses.add("JavaScript");
        courses.add("Java");
        courses.add("Python");

        System.out.println("Unique Courses: " + courses);
        System.out.println("Total Unique Courses: " + courses.size());

        String searchCourse = "Java";

        if (courses.contains(searchCourse)) {
            System.out.println(searchCourse + " course found.");
        } else {
            System.out.println(searchCourse + " course not found.");
        }
    }
}
