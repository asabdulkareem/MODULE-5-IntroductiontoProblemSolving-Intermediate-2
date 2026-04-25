using BenchmarkDotNet.Running;

List<Employee> employees =
[
    new Employee { Name = "Alice", Salary = 50000 },
    new Employee { Name = "Bob", Salary = 60000 },
];
employees.Sort(); // Sorts by Salary
employees.Reverse(); // Reverses 
foreach (var employee in employees)
{
    Console.Write(employee.Name);
    Console.WriteLine(employee.Salary);
}
List<EmployeePlain> employeesComparer =
[
    new EmployeePlain { Name = "Alice", Salary = 50000 },
    new EmployeePlain { Name = "Bob", Salary = 60000 },
];
EmployeeSalaryComparer salaryComparer = new EmployeeSalaryComparer();
employeesComparer.Sort(salaryComparer);
employeesComparer.Reverse();
foreach (var employee in employeesComparer)
{
    Console.Write(employee.Name);
    Console.WriteLine(employee.Salary);
}
List<EmployeePlain> employeesLambda=
[
    new EmployeePlain { Name = "Alice", Salary = 50000 },
    new EmployeePlain { Name = "Bob", Salary = 60000 },
];
employeesLambda.Sort((x, y) => x.Salary.CompareTo(y.Salary));
employeesLambda.Reverse();
foreach (var employee in employeesLambda)
{
    Console.Write(employee.Name);
    Console.WriteLine(employee.Salary);
}

BenchmarkRunner.Run<ComparisonBenchmarks>();