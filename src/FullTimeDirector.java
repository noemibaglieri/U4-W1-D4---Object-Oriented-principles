public class FullTimeDirector extends Employee {
    public FullTimeDirector( Department department) {
        super(department);
    }

    public void calculateSalary() {
        this.salary = 20 * 350;
    }


}
