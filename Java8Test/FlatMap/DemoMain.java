package Java8Test.FlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoMain {
    public static void main(String[] args) {
        List<List<String>> techCategories = new ArrayList<>();

        // Adding different technology categories
        List<String> programmingLanguages = new ArrayList<>(List.of("Java", "Python", "C++", "JavaScript"));
        List<String> databases = new ArrayList<>(List.of("MySQL", "PostgreSQL", "MongoDB", "Oracle"));
        List<String> cloudPlatforms = new ArrayList<>(List.of("AWS", "Azure", "Google Cloud", "IBM Cloud"));
        List<String> frameworks = new ArrayList<>(List.of("Spring Boot", "Django", "React", "Angular"));

        // Adding lists to the main list
        techCategories.add(programmingLanguages);
        techCategories.add(databases);
        techCategories.add(cloudPlatforms);
        techCategories.add(frameworks);

        System.out.println(techCategories);

        //Flatten the List to List into a single List.
        // s -> s.stream() converts each List to stream of List
        List<String> combinedList = techCategories.stream()
                .flatMap(s -> s.stream()).collect(Collectors.toList());
        System.out.println(combinedList);

        //Starts with J
        List<String> filterList = combinedList.stream()
                .filter(x->x.startsWith("J")).collect(Collectors.toList());
        System.out.println(filterList);

    }
}
