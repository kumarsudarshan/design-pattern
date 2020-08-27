package creational.pattern.singleton.clone;

public class Singleton implements Cloneable {

    private static Singleton soleInstance = null; // lazy instantiation

    private Singleton() {
        System.out.println("Creating ...");
    }

    // Lazy Instantiation
    public static Singleton getInstance() {
        if (soleInstance == null) {
            soleInstance = new Singleton();
        }
        return soleInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return soleInstance;
    }

}