package Java8Test;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Demo3 {
    public static void main(String args[]) {

        /* Create a list of Integers*/
        List<Integer> list = List.of(2, 5, 5, 8, 9, 10, 2, 5, 3);
        List<Integer> list1 = list.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(list1);

        Map<Integer, Integer> map = list.stream().distinct().collect(Collectors.toMap(x -> x, x -> x * x));
        System.out.println(map);

        System.out.println("List to map");
        List<String> names = Arrays.asList("Johny", "Mik", "Sara");
        Map<String, Integer> nameLengthMap = names.stream()
                .collect(Collectors.toMap(x->x, n->n.length()));
        System.out.println(nameLengthMap);

    }
}

