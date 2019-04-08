import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTester2 {
    private static final int MAX_T = 2;

    public static void main(String[] args) {
        Runnable thread1 = new MyThreadedClass("A");
        Runnable thread2 = new MyThreadedClass("B");
        Runnable thread3 = new MyThreadedClass("C");
        Runnable thread4 = new MyThreadedClass("D");

        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        pool.execute(thread1);
        pool.execute(thread2);
        pool.execute(thread3);
        pool.execute(thread4);

        pool.shutdown();
    }
}
