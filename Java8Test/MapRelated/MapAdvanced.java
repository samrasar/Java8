package Java8Test.MapRelated;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapAdvanced {
    public static void main(String[] args) {
        //Get the repeated list [2, 4, 5]
        List<Integer> al = List.of(1, 2, 2, 3, 4, 4, 5, 5, 5, 7);
        Map<Integer, Long> map = al.stream().collect(Collectors.groupingBy
                (Function.identity(), Collectors.counting()));
        List<Integer> duplicateList = map.entrySet().stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicateList);
    }
}
