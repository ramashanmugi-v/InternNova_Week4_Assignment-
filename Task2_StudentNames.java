import java.util.ArrayList;
import java.util.Scanner;

public class Task2_StudentNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        students.add("Arun");
        students.add("Priya");
        students.add("Karthik");
        students.add("Divya");
        students.add("Ravi");

        System.out.println("Student Names: " + students);

        System.out.print("Enter student name to remove: ");
        String removeName = sc.nextLine();

        if (students.remove(removeName)) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }

        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();

        if (students.contains(searchName)) {
            System.out.println("Student found.");
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("Final Student List: " + students);

        sc.close();
    }
}
