package Java8Test;

import java.util.*;

public class Java8DemoParallelStream {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int size = 1000000;
        Random rm = new Random();
        for (int i = 1; i <= size; i++) {
            al.add(rm.nextInt(100));
        }
        long startstr = System.currentTimeMillis();
        int sum = al.stream().map(i -> i * i).reduce(0, Integer::sum);
        long endstr = System.currentTimeMillis();

        long startpara = System.currentTimeMillis();
        int sum1 = al.parallelStream().map(i ->i * i ).reduce(0, Integer::sum);
        long endpara = System.currentTimeMillis();

        System.out.println(sum + " " + sum1);
        System.out.println(startstr);
        System.out.println(endstr);
        System.out.println(endstr-startstr);
        System.out.println(startpara);
        System.out.println(endpara);
        System.out.println(endpara-startpara);
    }
}

