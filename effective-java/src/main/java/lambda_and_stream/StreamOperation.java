package lambda_and_stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {
    public static void main(String[] args) {
        List<String> items = List.of("Hello", "Test", "Developer", "Java", "Kotlin");

        // 종단 연산자를 실행하지 않으면 연산 수행이 일체 진행되지 않음
        items.stream()
                .map(it -> {
                    System.out.println("executed (case of non-terminal-operator)");
                    return String.format("Let's learn about %s", it);
                });

        // 종단 연산자를 실행하면 모든 연산들이 그제서야 수행됨
        items.stream()
                .map(it -> {
                    System.out.println("executed (case of terminal-operator)");
                    return String.format("Let's learn about %s", it);
                })
                .collect(Collectors.toList());

    }
}
