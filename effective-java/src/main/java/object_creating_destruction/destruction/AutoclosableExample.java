package object_creating_destruction.destruction;

public class AutoclosableExample implements AutoCloseable {
    public static void main(String[] args) {
        try (AutoclosableExample autoclosableExample = new AutoclosableExample()) {
            autoclosableExample.printHello();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void printHello() {
        System.out.println("Hello, World!");
    }

    @Override
    public void close() throws Exception {
        System.out.println("정리되었습니다");
    }
}
