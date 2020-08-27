package creational.pattern.singleton;

public class Singleton {

//    private static Singleton soleInstance = new Singleton(); // eager instantiation
    private static Singleton soleInstance = null; // lazy instantiation
    private Singleton(){
        System.out.println("Creating ...");
    }

//    public static Singleton getInstance(){
//        return soleInstance;
//    }
    // Lazy Instantiation
    public static Singleton getInstance(){
        if(soleInstance == null){
            soleInstance = new Singleton();
        }
        return soleInstance;
    }

}