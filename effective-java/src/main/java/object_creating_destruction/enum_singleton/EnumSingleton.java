package object_creating_destruction.enum_singleton;

public class EnumSingleton {
    public static void main(String[] args) {
        SingletonClass singleton = SingletonClass.INSTANCE;
        System.out.printf("Hello, %s!\n", singleton.getName());
    }
}
