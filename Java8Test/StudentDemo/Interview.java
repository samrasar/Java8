package Java8Test.StudentDemo;

import java.util.Comparator;
import java.util.List;

public class Interview {
    public static void main(String[] args) {
        //4th highest even nos
        List<Integer> num = List.of(2, 42, 1, 45, 6, 77, 56, 34, 23, 22, 34, 55, 67, 88);
        System.out.println(num.stream().distinct().sorted(Comparator.reverseOrder())
                .filter(x -> x % 2 == 0).skip(3).findFirst());
    }
}
