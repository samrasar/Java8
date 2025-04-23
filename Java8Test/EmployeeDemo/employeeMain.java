package Java8Test.EmployeeDemo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class employeeMain {
    public static void main(String[] args) {
        List<Employee> ee = new ArrayList<>();
        ee.add(new Employee("Samrat", 22, "IT", "Male"));
        ee.add(new Employee("Ram", 24, "IT", "Male"));
        ee.add(new Employee("Mini", 29, "IT", "Female"));
        ee.add(new Employee("Rian", 26, "HR", "Female"));
        ee.add(new Employee("Kiaza", 28, "HR", "Female"));
        //Distinct Department Name
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
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(e -> e.getAge()))
                ));
        System.out.println("Max age by each Department: "+maxAgeByDept);

        Map<String, Integer> sumAge = ee.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.summingInt(Employee::getAge)));
        System.out.println("Sum of age of each department: "+sumAge);

        //Sort based on name length
        List<Employee>sortedEE= ee.stream().sorted(Comparator.comparingInt((Employee e) -> e.getName().length())
                        .reversed()).collect(Collectors.toList());
        System.out.println(sortedEE);


        /* ✅ Group employees by department,
           ✅ Sort each department's employees by age (descending).*/

        Map<String, List<Employee>> employeesByDept = ee.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingDouble(Employee::getAge).reversed())
                                        .collect(Collectors.toList())
                        )
                ));

        employeesByDept.forEach((dept, employees) -> {
            System.out.println("Department: " + dept);
            employees.forEach(e ->
                    System.out.println("  " + e.getName() + " - " + e.getAge())
            );
        });
    }
}
