package Java8Test.StudentDemo;


public class Student{
    private String Name;
    private int age;

    public Student(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
