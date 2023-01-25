package object_creating_destruction.effective_instancing;

import java.util.regex.Pattern;

public class InstancingExample {
    // 인스턴스화 비용이 비싼 객체는 싱글턴 사용이 추천됨
    private static final Pattern anyPattern = Pattern.compile("\\*{0,10}");

    public static void main(String[] args) {
        System.out.println(anyPattern.matcher("wow").matches());
    }
}
