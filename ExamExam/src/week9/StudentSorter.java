package week9;
import java.util.*;

public class StudentSorter {
    public static void main(String[] args) {
        Vector<Student> studentsVector = new Vector<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Student ID: ");
            String name = scanner.next();
            System.out.print("Marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Student student = new Student(name, marks);
            studentsVector.add(student);
        }

        System.out.println("\nStudents List (Original Order):");
        displayStudents(studentsVector);

        // Sort students based on marks using Collections.sort()
        Collections.sort(studentsVector);

        System.out.println("\nStudents List (Sorted by Marks):");
        displayStudents(studentsVector);

        scanner.close();
    }

    public static void displayStudents(Vector<Student> studentsVector) {
        if (studentsVector.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : studentsVector) {
                System.out.println(student);
            }
        }
    }
   
}

