package Java8Test.SalaryHike;

public class Employee {

    int id;
    String name;
    double salary;

    public void increaseSalary(double increment) {
        this.salary += this.salary * increment / 100;
    }

    public Employee(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
