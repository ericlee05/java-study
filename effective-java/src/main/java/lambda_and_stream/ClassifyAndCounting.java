package lambda_and_stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClassifyAndCounting {
    public static void main(String[] args) {
        List<Integer> items = List.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5);

        // 스트림 패러다임 위배
        Map<Integer, Integer> result1 = new HashMap<>();
        items.forEach(it -> {
            result1.merge(it, 1, Integer::sum);
        });
        System.out.println(result1);

        // 스트림 패러다임 준수
        Map<Integer, Integer> result2 = items.stream()
                .collect(Collectors.groupingBy(it -> it))
                .entrySet().stream()
                .map(it -> Map.entry(it.getKey(), it.getValue().size()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(result2);
    }
}
