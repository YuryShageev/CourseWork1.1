public class Employee {
    private String fullName;
    private int salary;
    private int departments;
    private final int id;
    private int counter;

    public Employee(String fullName, int departments, int salary) {
        this.fullName = fullName;
        this.departments = departments;
        this.salary = salary;
        id = counter++;
    }
}
