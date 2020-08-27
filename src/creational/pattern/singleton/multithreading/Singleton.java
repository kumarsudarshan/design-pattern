package creational.pattern.singleton.multithreading;

public class Singleton {
    // volatile variables "being stored in main memory". The Java volatile keyword guarantees visibility of changes to variables across threads
    private static volatile Singleton soleInstance = null; // lazy instantiation
//    private static Singleton soleInstance = null; // lazy instantiation

    private Singleton() {
        System.out.println("Creating ...");
    }

    // Lazy Instantiation
//    public static Singleton getInstance() {
//        if (soleInstance == null) { // thread 1and 2
//            soleInstance = new Singleton();
//        }
//        return soleInstance;
//    }

//    public static synchronized Singleton getInstance() {
//        if (soleInstance == null) {
//            soleInstance = new Singleton();
//        }
//        return soleInstance;
//    }

//    public static Singleton getInstance() {
//        if (soleInstance == null) {
//            synchronized (Singleton.class) {
//                soleInstance = new Singleton();
//            }
//        }
//        return soleInstance;
//    }

    // Double check
    public static Singleton getInstance() {
        // thread 2 - returns half cooked
        if (soleInstance == null) {
            synchronized (Singleton.class) {
                if(soleInstance == null) {
                    soleInstance = new Singleton(); // thread 1  - if 10 instance variable and only 5 varaible gets initialized,
                    // but soleInstance is not now than also, thread 2 will at line 38 will return half initialized soleInstance variable.
                    // to avoid such scenario, we are creating soleInstance as volatile.
                }
            }
        }
        return soleInstance;
    }

}