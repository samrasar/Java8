package Java8Test.SalaryHike;

import java.util.Arrays;
import java.util.List;

public class SalaryUpdate {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, 18000, "Amit"),
                new Employee(2, 28000, "Suit"),
                new Employee(3, 21000, "Sam")
        );

        employees.stream().filter(e -> e.salary < 20000).forEach(e -> e.increaseSalary(10));

        employees.forEach((System.out::println));
    }
}