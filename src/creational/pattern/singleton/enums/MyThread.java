package creational.pattern.singleton.enums;

public class MyThread implements Runnable{
    @Override
    public void run() {
        Singleton singleton = Singleton.INSTANCE;
        System.out.println("Object - singleton: " + singleton.hashCode());
    }
}
