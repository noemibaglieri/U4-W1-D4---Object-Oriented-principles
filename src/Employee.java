public abstract class Employee {
    private int id;
    protected double salary;
    private Department department;

    public Employee(Department department) {
        this.id = (int)(Math.random() * 1000);
        this.salary = 0;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return this.id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
