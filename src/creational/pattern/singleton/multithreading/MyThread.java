package creational.pattern.singleton.multithreading;

public class MyThread implements Runnable {

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Object - singleton: " + singleton.hashCode());
    }
}
