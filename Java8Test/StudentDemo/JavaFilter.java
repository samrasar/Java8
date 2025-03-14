package Java8Test.StudentDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaFilter {
    public static <Students> void main(String[] args) {

        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("a", 10));
        al.add(new Student("c", 17));
        al.add(new Student("b", 15));
        al.add(new Student("y", 12));

        List<Student> al1 = new ArrayList<>();
        al1 = al.stream().filter(s -> s.getAge() > 11).collect(Collectors.toList());
        al1.forEach(System.out::println);
    }

}
