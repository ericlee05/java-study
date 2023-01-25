package object_creating_destruction.effective_instancing;

public class StringSingletonExample {
    public static void main(String[] args) {
        // 기본적으로 스트링 리터럴은 싱글턴임!
        String str1 = "wow";
        String str2 = "wow";
        String str3 = "hi!";

        System.out.printf("str1: %s / str2: %s / str3: %s\n",
                str1.hashCode(), str2.hashCode(), str3.hashCode());
    }
}
