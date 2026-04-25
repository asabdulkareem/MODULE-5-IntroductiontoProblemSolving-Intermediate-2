package Performance;

public class Student {
    private String name;
    private int rollNumber;
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    // Getters
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + '}';
    }
}
