package Performance;

public class StudentCompareTo implements Comparable<StudentCompareTo>{
    private String name;
    private int rollNumber;
    public StudentCompareTo(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    @Override
    public int compareTo(StudentCompareTo other) {
        return this.rollNumber - other.getRollNumber();
    }
}
