package creational.pattern.singleton.serialization;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {

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
    // implemented bcoz when deserialize happens (readObject() called), it is guaranteed that readResolve() method will gets called.
    private Object readResolve() throws ObjectStreamException{
        System.out.println("---- read resolve ----");
        return soleInstance;
    }

}