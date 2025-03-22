package Java8Test.EmployeeDemo;

import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private String gender;
    private String department;

    public Employee(String name, int age, String department, String gender) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(gender, employee.gender) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
