package Performance;
import java.util.Comparator;

public class RollNumberComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getRollNumber() - s2.getRollNumber();
    }
}
