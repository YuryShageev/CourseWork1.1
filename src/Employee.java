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

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartments() {
        return departments;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartments(int departments) {
        this.departments = departments;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник под номером: " + id + " По имени: " + fullName + " Отдела: " + departments + " Получает " + salary + " рублей";
    }
}
