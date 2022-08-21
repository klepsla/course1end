public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван", 1, 10000.0);
        employees[1] = new Employee("Петров Денис", 2, 15000.0);
        employees[2] = new Employee("Сидоров Илья", 3, 20000.0);
        employees[3] = new Employee("Костылев Геннадий", 4, 25000.0);
        employees[4] = new Employee("Шилов Денис", 5, 30000.0);
        employees[7] = new Employee("Остапчук Александр", 6, 35000.0);
        printAllEmployee();
        System.out.println(getEmployeeMinSalary());
        System.out.println(getEmployeeMaxSalary());
        System.out.println(getAndCalculateAverageSalary());
        printFullnameAllEmployee();
    }

    public static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getAndCalculateSalarySum() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double minSalary = -1;
        Employee minSalaryEmp = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                minSalary = employees[i].getSalary();
                minSalaryEmp = employees[i];
                index = i;
                break;
            }
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmp = employees[i];
                }
            }
        }
        return minSalaryEmp;
    }

    public static Employee getEmployeeMaxSalary() {
        double maxSalary = -1;
        Employee maxSalaryEmp = null;
         int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmp = employees[i];
                index = i;
                break;
            }
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmp = employees[i];
                }
            }
        }
        return maxSalaryEmp;

    }

    public static double getAndCalculateAverageSalary() {
        double sumSalaryAllEmp = getAndCalculateSalarySum();
        if (employees.length != 0) {
            return sumSalaryAllEmp/employees.length;
        } else {
            return  0;
        }
    }

    public static void printFullnameAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }
}

