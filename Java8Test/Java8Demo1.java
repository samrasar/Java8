package Java8Test;

import java.util.List;
import java.util.stream.Collectors;

public class Java8Demo1 {
    public static void main(String args[]) {

        /* Create a list of Integers*/
        List<Integer> list = List.of(2, 5, 8, 9, 12, 43, 28, 17, 20);

        System.out.println("1. Print all nos");
        list.stream().forEach(System.out::println);

        System.out.println("2. Print all even nos");
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        List<String> courses = List.of("Spring", "Spring boot", "AWS", "API", "AZURE", "Docker", "Micro services");

        System.out.println("3. Print all courses which contains Spring");
        courses.stream().filter(i -> i.contains("Spring")).forEach(System.out::println);

        System.out.println("4. Print all courses where length more than 4");
        courses.stream().filter(i -> i.length() > 4).forEach(System.out::println);

        System.out.println("5. Print square of all the even nos");
        list.stream().filter(i -> i % 2 == 0)
                .map(num -> num * num).forEach(System.out::println);

        System.out.println("6. Print the course name and length of the string");
        courses.stream().map(i -> i + ":" + i.length()).forEach(System.out::println);

        System.out.println("6. Collect to a new list");
        List<String> a2 = courses.stream().map(i -> i + ":" + i.length()).collect(Collectors.toList());
        System.out.println(a2);

        System.out.println("7. Make Courses uppercase");
        courses.stream().map(i->i.toUpperCase()).forEach(System.out::println);
    }

}

