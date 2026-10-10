import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentRecordManager {

    static class Student {
        int id;
        String name;
        String course;
        int age;

        Student(int id, String name, String course, int age) {
            this.id = id;
            this.name = name;
            this.course = course;
            this.age = age;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ID: ").append(id);
            sb.append(" | Name: ").append(name);
            sb.append(" | Course: ").append(course);
            sb.append(" | Age: ").append(age);
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Student> students = new HashMap<>();

        boolean running = true;

        while (running) {
            System.out.println("\n===== Student Record Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Display Unique Courses");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        if (id <= 0) {
                            System.out.println("Error: Student ID must be positive.");
                            break;
                        }

                        if (students.containsKey(id)) {
                            System.out.println("Error: Student ID already exists.");
                            break;
                        }

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine().trim();

                        System.out.print("Enter Course: ");
                        String course = sc.nextLine().trim();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        if (name.isEmpty() || course.isEmpty()) {
                            System.out.println("Error: Name and course cannot be empty.");
                            break;
                        }

                        if (age <= 0) {
                            System.out.println("Error: Age must be positive.");
                            break;
                        }

                        students.put(id, new Student(id, name, course, age));
                        System.out.println("Student added successfully.");
                        break;

                    case 2:
                        if (students.isEmpty()) {
                            System.out.println("No student records available.");
                        } else {
                            System.out.println("\nStudent Records:");
                            for (Student student : students.values()) {
                                System.out.println(student);
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Enter Student ID to search: ");
                        int searchId = sc.nextInt();
                        sc.nextLine();

                        if (searchId <= 0) {
                            System.out.println("Error: Invalid Student ID.");
                        } else if (students.containsKey(searchId)) {
                            System.out.println("Student Found:");
                            System.out.println(students.get(searchId));
                        } else {
                            System.out.println("Student not found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Student ID to remove: ");
                        int removeId = sc.nextInt();
                        sc.nextLine();

                        if (removeId <= 0) {
                            System.out.println("Error: Invalid Student ID.");
                        } else if (students.remove(removeId) != null) {
                            System.out.println("Student removed successfully.");
                        } else {
                            System.out.println("Student not found.");
                        }
                        break;

                    case 5:
                        HashSet<String> courses = new HashSet<>();

                        for (Student student : students.values()) {
                            courses.add(student.course);
                        }

                        if (courses.isEmpty()) {
                            System.out.println("No courses available.");
                        } else {
                            System.out.println("Unique Courses: " + courses);
                        }
                        break;

                    case 6:
                        running = false;
                        System.out.println("Thank you for using Student Record Manager.");
                        break;

                    default:
                        System.out.println("Invalid menu choice. Please select 1 to 6.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter valid numeric input.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("An unexpected error occurred.");
            }
        }

        sc.close();
    }
}
