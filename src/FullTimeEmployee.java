public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(Department department) {
        super(department);
    }

    public void calculateSalary() {
        int workedDays = 20;
        this.salary = workedDays * 80;
    }
}
