package creational.pattern.singleton.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(thread);
        service.submit(thread);
        service.shutdown();
    }
}
