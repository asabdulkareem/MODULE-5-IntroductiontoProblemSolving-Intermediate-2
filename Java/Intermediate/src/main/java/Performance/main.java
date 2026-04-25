package Performance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3));
        students.add(new Student("Charlie", 2));
        students.add(new Student("Bob", 1));
        // Sort by name using a lambda expression
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("Sorted by Name: " + students);
        // Sort by roll number using a lambda expression
        Collections.sort(students, Comparator.comparingInt(Student::getRollNumber));
        System.out.println("Sorted by Roll Number: " + students);

        // Sort by name using a Using Comparator
        Collections.sort(students, new NameComparator()); // Sorts by name
        System.out.println("Sorted by Name By Comparator: " + students);
        // Sort by roll number using a Using Comparator
        Collections.sort(students, new RollNumberComparator());
        System.out.println("Sorted by Roll Number By Comparator: " + students);

        List<StudentCompareTo> studentsC = new ArrayList<StudentCompareTo>();
        studentsC.add(new StudentCompareTo("Alice", 3));
        studentsC.add(new StudentCompareTo("Charlie", 2));
        studentsC.add(new StudentCompareTo("Bob", 1));
        Collections.sort(studentsC); // Uses compareTo method of Student class
        System.out.println("Sorted by Roll Number By Comparable: " + studentsC);
    }
}
