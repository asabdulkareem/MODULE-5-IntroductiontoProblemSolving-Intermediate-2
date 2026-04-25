namespace Performance
{
    internal class EmployeeSalaryComparer : IComparer<EmployeePlain>
    {
        public int Compare(EmployeePlain x, EmployeePlain y)
        {
            return x.Salary.CompareTo(y.Salary);
        }
    }
}
