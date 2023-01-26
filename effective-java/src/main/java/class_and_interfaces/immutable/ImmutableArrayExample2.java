package class_and_interfaces.immutable;

// Method 2: 호출 시마다 복사본 반환
public class ImmutableArrayExample2 {
    private static final Integer[] PRIVATE_ARRAY = {};
    public static final Integer[] ARRAY() {
        return PRIVATE_ARRAY.clone();
    }
}
