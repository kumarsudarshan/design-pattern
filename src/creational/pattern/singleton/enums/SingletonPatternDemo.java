package creational.pattern.singleton.enums;


import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonPatternDemo {

    public static void main(String[] args) throws Exception {
        MyThread thread = new MyThread();
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(thread);
        service.submit(thread);
        service.shutdown();

    }
}
