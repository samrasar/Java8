package Java8Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Java8Demo2 {
    public static void main(String args[]) {

        /* Create a list of Integers*/
        List<Integer> list = List.of(2, 5, 5, 8, 9, 10, 2, 5, 3);

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum of all the numbers :" + sum);
        int sumUsingMethRef = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum of all the numbers :" + sumUsingMethRef);

        int max = list.stream().reduce(0, (x, y) -> x > y ? x : y);
        System.out.println("Max Value :" + max);

        int maxnum = list.stream()
                .reduce(Integer::max)
                .orElse(0);
        System.out.println("Max Value 1:" + maxnum);

        int minnum = list.stream()
                .reduce(Integer::min)
                .orElse(0);
        System.out.println("Min Value :" + minnum);

        Optional<Integer> min = list.stream().reduce(Integer::min);
        System.out.println("Min Value 1 :" + min.get());

        int square_sum = list.stream().map(x -> x * x).reduce(0, (x, y) -> x + y);
        System.out.println("Sum of square of all values :" + square_sum);

        int even_sum = list.stream().filter(x -> x % 2 == 0).reduce(0, Integer::sum);
        System.out.println("Sum of even values :" + even_sum);

        System.out.println("Distinct values");
        list.stream().distinct().forEach(System.out::println);

        System.out.println("Sorted values works on String as well");
        list.stream().sorted().distinct().forEach(System.out::println);

        System.out.println("Sorted values reverse order");
        list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);

        System.out.println("Sorted based on custom defined");
        List<String> courses = List.of("Spring", "Spring boot", "AWS", "API", "AZURE", "Docker", "Micro services");
        courses.stream().sorted(Comparator.comparing(x -> x.length())).forEach(System.out::println);
    }

}

