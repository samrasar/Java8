package Java8Test.EmployeeDemo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class employeeMain {
    public static void main(String[] args) {
        List<Employee> ee = new ArrayList<>();
        ee.add(new Employee("Sam", 22, "IT", "Male"));
        ee.add(new Employee("Ram", 24, "IT", "Male"));
        ee.add(new Employee("Ria", 26, "HR", "Female"));
        ee.add(new Employee("Kia", 28, "HR", "Female"));

        ee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        //no of EE in each dep
        Map<String, Long> countMap = ee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(countMap);

        //Avg age of all the EEs based on gender
        Map<String, Double> avgAgeMap = ee.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeMap);

        //Print Max age based on each Dept
        Map<String, Optional<Employee>> maxAgeByDept = ee.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getDepartment(),
                        Collectors.maxBy(Comparator.comparingInt(e -> e.getAge()))
                ));
        System.out.println(maxAgeByDept);
    }
}
