package Java8Test.MapRelated;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCount {
    public static void main(String[] args) {
        String str= "aajjgdfggs";

        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c) // Convert int to Character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencyMap);

        String str1= "What do you do";

        Map<String, Long> wordCount =
                Arrays.stream(str1.split(" ")) // Split string by spaces
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordCount);

        String[] strArr =str1.split(" ");
        Map<String, Long> wordCountFromArray = Arrays.stream(strArr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordCountFromArray);

        //count the freq of the letters in a string except Spaces
        String str2 = "this is a laptop";

        Map<Character, Long> hm = str2.chars().mapToObj(c -> (char) c)
                .filter(x->!x.toString().equals(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(hm);

    }
}
