package class_and_interfaces.immutable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Method 1: 수정 불가 리스트로 반환
public class ImmutableArrayExample1 {
    private static final Integer[] PRIVATE_ARRAY = {};
    public static final List<Integer> ARRAY = Collections.unmodifiableList(Arrays.asList(PRIVATE_ARRAY));
}
