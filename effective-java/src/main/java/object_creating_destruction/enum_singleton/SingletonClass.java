package object_creating_destruction.enum_singleton;

// 다른 클래스를 상속받을 수 없음
public enum SingletonClass {
    INSTANCE;

    private String name = "Someone";

    public String getName() {
        return name;
    }
}
