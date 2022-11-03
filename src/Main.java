public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Васечкин Пётр Сергеевич", 2, 89473);
        employees[1] = new Employee("Клод Жан Вандамович", 1, 111384);
        employees[2] = new Employee("Шварцнегер Арнольд Терминаторович", 4, 38912);

        if (employees != null) {
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i].toString());
            }
        }
//        for (int i = 0; i < employees.length; i++) {
//            if (employees.length != 0) {
//                System.out.println(employees[i].toString());
//            }
//        }
    }
}