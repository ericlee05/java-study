package object_creating_destruction.destruction;

import java.lang.ref.Cleaner;

public class AutoclosableWithCleaner implements AutoCloseable {
    public static void main(String[] args) {
        AutoclosableWithCleaner autoclosableExample = new AutoclosableWithCleaner();
        autoclosableExample.printHello();

        // Cleaner가 객체를 정리해주는 Runnable을 호출함 (근데 100% 동작 보장은 아님...)
        // 진짜 큰 객체는 그냥 try-with-resources 사드세요... 제발...
    }

    private static class CleaningJob implements Runnable {
        @Override
        public void run() {
            System.out.println("정리되었습니다");
        }
    }

    private final CleaningJob job = new CleaningJob();
    private final Cleaner.Cleanable cleanable = Cleaner.create().register(this, job);

    public void printHello() {
        System.out.println("Hello, World!");
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}
