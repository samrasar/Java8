package Java8Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        /* Create a list of Integers*/
        List<Integer> list = List.of(2, 5, 8, 9, 12);
/*        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);
        int max = list.stream().reduce(0, (x, y) -> x > y ? x : y);
        System.out.println(max);
       Optional max1=  list.stream().distinct().sorted().findFirst();
        System.out.println(max1.orElse(null));*/
        list.stream().filter(x -> x % 2 == 0).map(x -> x * x).forEach(System.out::println);
        int s = list.stream().filter(x -> x % 2 == 0).map(x -> x * x).reduce(0, (x, y) -> x + y);
        System.out.println(s);
        System.out.println("Sorted based on custom defined");
        List<String> courses = List.of("Spring", "Spring boot", "AWS", "API", "AZURE", "Docker", "Micro services");
        System.out.println(courses.stream().sorted(Comparator.comparingInt(x -> x.length())).collect(Collectors.toList()));

        List<Integer> numbers = Arrays.asList(5, 1, 9, 3, 7, 9, 8);
        Optional mx = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst();
        if (mx.isPresent()) {
            System.out.println(mx.get());
        }
    }
}
