package Java8Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Java8Demo2 {
    public static void main(String args[]) {

        /* Create a list of Integers*/
        List<Integer> list = List.of(2, 5, 5, 8, 9, 10, 2, 5, 3);

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("1. Sum of all the numbers :" + sum);

        int sumUsingMethRef = list.stream().reduce(0, Integer::sum);
        System.out.println("1.1 Sum of all the numbers :" + sumUsingMethRef);

        int max = list.stream().reduce(0, (x, y) -> x > y ? x : y);
        System.out.println("2. Max Value :" + max);

        int maxnum = list.stream()
                .reduce(Integer::max)
                .orElse(0);
        System.out.println("2.1 Max Value :" + maxnum);

        int minnum = list.stream()
                .reduce(Integer::min)
                .orElse(0);
        System.out.println("3. Min Value :" + minnum);

        Optional<Integer> min = list.stream().reduce(Integer::min);
        System.out.println("3.1 Min Value :" + min.get());

        int square_sum = list.stream().map(x -> x * x).reduce(0, (x, y) -> x + y);
        System.out.println("4. Sum of square of all values :" + square_sum);

        int even_sum = list.stream().filter(x -> x % 2 == 0).reduce(0, Integer::sum);
        System.out.println("5. Sum of even values :" + even_sum);

        System.out.println("7. Distinct values");
        list.stream().distinct().forEach(System.out::println);

        System.out.println("8. Sorted values works on String as well");
        list.stream().sorted().distinct().forEach(System.out::println);

        System.out.println("9. Sorted values reverse order");
        list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);

        System.out.println("10. Sorted based on custom defined");
        List<String> courses = List.of("Spring", "Spring boot", "AWS", "API", "AZURE", "Docker", "Micro services");
        courses.stream().sorted(Comparator.comparing(x -> x.length())).forEach(System.out::println);
    }

}

