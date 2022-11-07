public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Васечкин Пётр Сергеевич", 2, 89473);
        employees[1] = new Employee("Клод Жан Вандамович", 1, 111384);
        employees[2] = new Employee("Шварцнегер Арнольд Терминаторович", 4, 38912);
        employees[3] = new Employee("Стёпа Дядя Великанович", 4, 69832);
        employees[4] = new Employee("Фон Ай Эпплович", 2, 137584);
        employees[5] = new Employee("Хонор Хаувэй Китаевич", 3, 456352);
        employees[6] = new Employee("Андерсон Ганс Кристиан", 2, 45673);
        employees[7] = new Employee("Смит Иии Вессон", 1, 99374);
        employees[8] = new Employee("Пистолет Пулемёт Шпагина", 5, 70437);
        employees[9] = new Employee("Grand Theft Auto", 4, 59673);
        printListOfEmployees(employees);

        printTotalSalary(employees);

        printMinSalary(employees);

        printMaxSalary(employees);

        printAverageSalary(employees);

        printEmployeeNames(employees);
    }

    public static void printListOfEmployees(Employee[] employees) {
        if (employees.length == 0) {
            System.out.println("is empty");
            return;
        }
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }

    }

    public static void printTotalSalary(Employee[] employees) {
        int totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary += employees[i].getSalary();
        }
        System.out.println("Сумма затрат за месяц: " + totalSalary);
    }

    public static void printMinSalary(Employee[] employees) {
        int minEmployeeSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minEmployeeSalary > employees[i].getSalary()) {
                minEmployeeSalary = employees[i].getSalary();
                System.out.println("Минимальная зарплата в: " + minEmployeeSalary + " рублей, сотрудника " + employees[i].getFullName() + " за месяц");
            }
        }
    }

    public static void printMaxSalary(Employee[] employees) {
        int maxEmployeeSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxEmployeeSalary < employees[i].getSalary()) {
                maxEmployeeSalary = employees[i].getSalary();
                System.out.println("Максимальная зарплата в: " + maxEmployeeSalary + " рублей, сотрудника " + employees[i].getFullName() + " за месяц");
            }

        }

    }

    public static void printAverageSalary(Employee[] employees) {
        int averageSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            averageSalary += employees[i].getSalary() / employees.length;
            System.out.println("Средняя зарплата в: " + averageSalary + " рублей, сотрудника " + employees[i].getFullName() + " за месяц");
        }
    }

    public static void printEmployeeNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }


}
