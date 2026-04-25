package Performance;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class SortingBenchmark {

    @Param({"100", "1000", "10000"})
    public int size;

    private List<Student> baseStudents;
    private List<StudentCompareTo> baseComparableStudents;

    @Setup(Level.Trial)
    public void setup() {
        Random random = new Random(42);
        baseStudents = new ArrayList<>(size);
        baseComparableStudents = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            int rollNumber = random.nextInt(Integer.MAX_VALUE);
            String name = "Student-" + i;
            baseStudents.add(new Student(name, rollNumber));
            baseComparableStudents.add(new StudentCompareTo(name, rollNumber));
        }
    }

    @Benchmark
    public List<Student> lambdaExpressionSortByRollNumber() {
        List<Student> students = new ArrayList<>(baseStudents);
        students.sort(Comparator.comparingInt(Student::getRollNumber));
        return students;
    }

    @Benchmark
    public List<Student> comparatorClassSortByRollNumber() {
        List<Student> students = new ArrayList<>(baseStudents);
        students.sort(new RollNumberComparator());
        return students;
    }

    @Benchmark
    public List<StudentCompareTo> comparableSortByRollNumber() {
        List<StudentCompareTo> students = new ArrayList<>(baseComparableStudents);
        students.sort(null);
        return students;
    }
}

