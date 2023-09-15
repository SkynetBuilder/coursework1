public class Employee {
    private String fio;
    private int branch;
    private int salary;
    private int id;
    private static int counter;

    public Employee(String fio, int branch, int salary) {
        counter++;
        id = counter;
        this.fio = fio;
        setBranch(branch);
        this.salary = salary;
    }

    public String getFio() {
        return fio;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        if (branch < 1 || branch > 5) {
            throw new IllegalArgumentException("Некорректно указан отдел, допустимы значения от 1 до 5");
        }
        this.branch = branch;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Сотрудник " + fio + ", отдел " + branch + ", заработная плата " + salary + " руб., id " + id;
    }
}