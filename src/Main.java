public class Main {
    public static void main(String[] args) {

        FullTimeEmployee employee1 = new FullTimeEmployee(Department.PRODUCTION);
        employee1.calculateSalary();
        System.out.println(employee1.getSalary());

        FullTimeDirector employee2 = new FullTimeDirector(Department.ADMINISTRATION);
        employee2.calculateSalary();
        System.out.println(employee2.getSalary());

        PartTimeEmployee employee3 = new PartTimeEmployee(Department.SALES);
        employee3.calculateSalary(169,15);
        System.out.println(employee3.getSalary());

        Employee[] allEmployees = { employee1, employee2, employee3};

        double allSalaries = 0;
        for(Employee employee : allEmployees) {
            allSalaries += employee.salary;
        }
        System.out.println("Total salaries: " + allSalaries);


    }
}
