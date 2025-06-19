public class PartTimeEmployee extends Employee {

    private int workedHours = 0;

    public PartTimeEmployee(Department department) {
        super(department);
    }

    public void calculateSalary(int workedHours, int salaryPerHour) {
        this.workedHours = workedHours;
        this.salary = workedHours * salaryPerHour;
    }
}
