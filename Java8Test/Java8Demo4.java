package Java8Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Demo4 {
    public static void main(String[] args) {
        System.out.println("Find the Second-Highest Number in a List");
        List<Integer> numbers = Arrays.asList(5, 1, 9, 3, 7, 9, 8, 7);
        Optional<Integer> secondHighest = numbers.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst();
        System.out.println(secondHighest.orElse(null));

        System.out.println("Find the Longest Word in a Sentence");
        String sentence = "Java 8 Stream API is powerful for data processing";
        String longest = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(longest);

        System.out.println("Merge Two Sorted Lists into a Single Sorted List Without Duplicates");
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 3, 6, 8);

        List<Integer> ml = Stream.concat(list1.stream(), list2.stream())
                .distinct().sorted()
                .collect(Collectors.toList());
        System.out.println(ml);
    }
}
