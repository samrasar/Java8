package Java8Test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Demo5 {
    public static void main(String[] args) {
        List<String> courses =
                List.of("Spring", "Spring boot", "AWS", "API", "AZURE", "Docker", "Micro services");
        String name ="abcssfdhertua";
        String vowels = "aeiouAEIOU";

        // Count each vowel separately
        Map<Character, Long> vowelCountMap = name.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> vowels.indexOf(c) != -1) //when not found returns -1
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the vowel counts
        System.out.println("Vowel Counts: " + vowelCountMap);
       /*
        vowels is the string "aeiouAEIOU" (containing all vowels in lowercase and uppercase).
        indexOf(c) returns the index position of character c in the vowels string.
                If c is found in vowels, indexOf(c) returns a non-negative index (0 or greater).
                If c is not found, indexOf(c) returns -1.
                != -1

        This ensures that only characters present in the vowels string are retained.
        If indexOf(c) != -1, it means c is a vowel, so it passes through the filter.*/

        List<Character> vowelList = name.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> vowels.indexOf(c) != -1).collect(Collectors.toList());
        System.out.println(vowelList);

        //Make half upper and half lower
        String s="absc";
        int halfLen=s.length()/2;

        String result = s.substring(0,halfLen).toLowerCase()+s.substring(halfLen,s.length()).toUpperCase();
        System.out.println(result);

    }
}
