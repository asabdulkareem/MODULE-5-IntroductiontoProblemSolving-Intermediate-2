using BenchmarkDotNet.Attributes;

namespace Performance
{
    public class ComparisonBenchmarks
    {
        private List<Employee> employees = new List<Employee>();
        private List<EmployeePlain> employeesPlain = new List<EmployeePlain>();

        [GlobalSetup]
        public void Setup()
        {
            employees =
            [
                new Employee { Name = "Alice", Salary = 50000 },
                new Employee { Name = "Bob", Salary = 60000 }
            ];
            employeesPlain =
            [
                new EmployeePlain { Name = "Alice", Salary = 50000 },
                new EmployeePlain { Name = "Bob", Salary = 60000 }
            ];
        }

        [Benchmark]
        public List<Employee> TestIComparable()
        {
            employees.Sort();
            return employees;
        }

        [Benchmark]
        public List<EmployeePlain> TestIComparer()
        {
            EmployeeSalaryComparer salaryComparer = new();
            employeesPlain.Sort(salaryComparer);
            return employeesPlain;
        }

        [Benchmark]
        public List<EmployeePlain> TestComparisonDelegate()
        {
            employeesPlain.Sort((x, y) => x.Salary.CompareTo(y.Salary));
            return employeesPlain;
        }

    }
}
