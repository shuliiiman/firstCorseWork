public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Иванов", "Александр", "Романович", 4, 49647);
        employees[0] = firstEmployee;
        Employee secondEmployee = new Employee("Петрова", "Наталья", "Викторовна", 4, 73695);
        employees[1] = secondEmployee;
        Employee thirdEmployee = new Employee("Снежный", "Леонид", "Павлович", 2, 37585);
        employees[2] = thirdEmployee;
        Employee fourthEmployee = new Employee("Рост", "Михаил", "Валерьевич", 1, 738454);
        employees[3] = fourthEmployee;
        Employee fifthEmployee = new Employee("Светлый", "Богдан", "Крнстанинович", 2, 54745);
        employees[4] = fifthEmployee;
        Employee sixthEmployee = new Employee("Честный", "Фёдор", "Фёедорович", 4, 84965);
        employees[5] = sixthEmployee;
        Employee seventhEmployee = new Employee("Смирнова", "Юлия", "Александровна", 4, 837595);
        employees[6] = seventhEmployee;
        Employee eighthEmployee = new Employee("Лихачёв", "Валерий", "Викторович", 3, 274854);
        employees[7] = eighthEmployee;
        Employee ninthEmployee = new Employee("Аккуратный", "Даниил", "Робортович", 5, 649586);
        employees[8] = ninthEmployee;
        ninthEmployee.setMiddleName("Аккуратов");
        ninthEmployee.setFirstName("Даня");
        ninthEmployee.setLastName("Робертович");
        ninthEmployee.setDepartment(5);
        ninthEmployee.setSalary(474965);
        Employee tenthEmployee = new Employee("Мирный", "Семён", "Богданович", 5, 598478);
        employees[9] = tenthEmployee;
        printEmployees();
        printSumSalary();
        findMinSalary();
        findMaxSalary();
        findMidleSalary();
        getAllFullName();

    }

    private static void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    private static void printSumSalary() {
        int sum = 0;
        System.out.print("*|*SumSalary = *(");
        for (Employee employeeSum : employees) {
            sum += employeeSum.getSalary();
        }
        System.out.println(sum+")*|*");
    }
    private static void findMinSalary() {
        int minSalary=employees[0].getSalary();
        System.out.print("*|*MinSalary = *(");
        for (Employee employeeMinSalary : employees) {
            if (employeeMinSalary.getSalary() <= minSalary) {
                minSalary= employeeMinSalary.getSalary();
            }
        }
        System.out.println(minSalary+")*|*");
    }
    private static void findMaxSalary() {

        int maxSalary= employees[0].getSalary();
        System.out.print("*|*MaxSalary = *(");
        for (Employee employeeMaxSalary : employees) {
            if (employeeMaxSalary.getSalary() >= maxSalary) {
                maxSalary=employeeMaxSalary.getSalary();
            }
        }
        System.out.println(maxSalary+")*|*");
    }
    private static void findMidleSalary() {
        double sum=0;
        System.out.print("*|*MidleSalary = *(");
        for (Employee employeeMidleSalary : employees) {
            sum+= employeeMidleSalary.getSalary();
        }
        System.out.println(sum/employees.length+")*|*");
    }
    private static void getAllFullName() {
        System.out.print("*|*AllFullName : ");
        for (Employee employeeFullName : employees) {
            if (employeeFullName!=null) {
                System.out.print("*("+employeeFullName.getMiddleName()+" "+employeeFullName.getFirstName()+" "+employeeFullName.getLastName()+")*");
            }
        }
        System.out.println("|*");
    }
}