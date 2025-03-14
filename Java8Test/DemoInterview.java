package Java8Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoInterview {
    public static void main(String[] args) {
        List<Integer> al1 = List.of(2, 5, 5, 8, 9, 10, 2, 5, 3);

        List<Integer> val = al1.stream().map(number -> number * 3)
                .filter(i -> i.intValue() > 6).collect(Collectors.toList());
        System.out.println(val);

        al1.forEach(s -> {
            if (s % 2 == 0) {
                System.out.println("value : " + s);
            }
        });

        al1.forEach(System.out::print);
    }

}
