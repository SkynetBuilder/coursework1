public class Main {
    public static void printAll(Employee[] book) {
        for (Employee employee : book) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int allSalaryExpenses(Employee[] book) {
        int allSalaryExpenses = 0;
        for (Employee employee : book) {
            if (employee != null) {
                allSalaryExpenses += employee.getSalary();
            }
        }
        return allSalaryExpenses;
    }

    public static Employee minSalaryEmployee(Employee[] book) {
        Employee minSalaryEmployee = book[0];
        for (Employee employee : book) {
            if (employee != null && minSalaryEmployee.getSalary() > employee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee maxSalaryEmployee(Employee[] book) {
        Employee maxSalaryEmployee = book[0];
        for (Employee employee : book) {
            if (employee != null && maxSalaryEmployee.getSalary() < employee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static int averageSalary(Employee[] book) {
        return allSalaryExpenses(book) / book.length;
    }

    public static void allEmployeesFio(Employee[] book) {
        for (Employee employee : book) {
            if (employee != null) {
                System.out.println(employee.getFio());
            }
        }
    }

    public static void setSalaryWithIndexation(Employee[] book, float percent) {
        for (Employee employee : book) {
            if (employee != null) {
                employee.setSalary((int) ((percent * 0.01f + 1) * employee.getSalary()));
            }
        }
    }

    public static Employee minSalaryEmployee(Employee[] book, int branch) {
        Employee minSalaryEmployee = maxSalaryEmployee(book);
        for (Employee employee : book) {
            if (employee != null && employee.getBranch() == branch) {
                if (minSalaryEmployee.getSalary() > employee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee maxSalaryEmployee(Employee[] book, int branch) {
        Employee maxSalaryEmployee = minSalaryEmployee(book);
        for (Employee employee : book) {
            if (employee != null && employee.getBranch() == branch) {
                if (maxSalaryEmployee.getSalary() < employee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static int allSalaryExpenses(Employee[] book, int branch) {
        int allSalaryExpenses = 0;
        for (Employee employee : book) {
            if (employee != null && employee.getBranch() == branch) {
                allSalaryExpenses += employee.getSalary();
            }
        }
        return allSalaryExpenses;
    }

    public static int averageSalary(Employee[] book, int branch) {
        int counter = 1;
        for (Employee employee : book) {
            if (employee != null && employee.getBranch() == branch) {
                counter++;
            }
        }
        if (counter > 1) {
            counter--;
        }
        return allSalaryExpenses(book, branch) / counter;
    }

    public static void setSalaryWithIndexation(Employee[] book, float percent, int branch) {
        for (Employee employee : book) {
            if (employee != null && employee.getBranch() == branch) {
                employee.setSalary((int) ((percent * 0.01f + 1) * employee.getSalary()));
            }
        }
    }

    public static void printAll(Employee[] book, int branch) {
        for (Employee employee : book) {
            if (employee != null && employee.getBranch() == branch) {
                System.out.println(employee.toString().replaceAll(", отдел " + branch, ""));
            }
        }
    }

    public static void printEmployeesWithLowerSalary(Employee[] book, int salary) {
        for (Employee employee : book) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println(employee.toString().replaceAll(", отдел " + employee.getBranch(), ""));
            }
        }
    }

    public static void printEmployeesWithHigherSalary(Employee[] book, int salary) {
        for (Employee employee : book) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println(employee.toString().replaceAll(", отдел " + employee.getBranch(), ""));
            }
        }
    }

    public static void main(String[] args) {
        Employee[] book = new Employee[10];
        book[0] = new Employee("Иванов С.А", 5, 64874);
        book[1] = new Employee("Сергеев В.С.", 3, 74428);
        book[2] = new Employee("Свиридов А.А.", 4, 24525);
        book[3] = new Employee("Коршунова А.В.", 2, 86834);
        book[4] = new Employee("Петрова Ю.К.", 1, 129000);
        book[5] = new Employee("Ветров Ю.Л.", 1, 46475);
        book[6] = new Employee("Шустова У.В.", 5, 45644);
        book[7] = new Employee("Ложкин Н.А.", 2, 46566);
        book[8] = new Employee("Долина Е.С.", 4, 88888);
        book[9] = new Employee("Филинов П.Р.", 3, 35742);
    }
}