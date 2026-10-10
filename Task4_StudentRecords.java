import java.util.HashMap;
import java.util.Scanner;

public class Task4_StudentRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Arun");
        students.put(102, "Priya");
        students.put(103, "Karthik");
        students.put(104, "Divya");
        students.put(105, "Ravi");

        System.out.println("Student Records:");
        System.out.println(students);

        System.out.print("Enter Student ID to search: ");
        try {
            int id = sc.nextInt();

            if (students.containsKey(id)) {
                System.out.println("Student Name: " + students.get(id));
            } else {
                System.out.println("Student ID not found.");
            }

            System.out.print("Enter Student ID to remove: ");
            int removeId = sc.nextInt();

            if (students.containsKey(removeId)) {
                students.remove(removeId);
                System.out.println("Student removed successfully.");
            } else {
                System.out.println("Student ID not found.");
            }

            System.out.println("Updated Student Records:");
            System.out.println(students);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric Student ID.");
        }

        sc.close();
    }
}
