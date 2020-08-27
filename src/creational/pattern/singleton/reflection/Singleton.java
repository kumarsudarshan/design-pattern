package creational.pattern.singleton.reflection;

public class Singleton {

    private static Singleton soleInstance = null; // lazy instantiation

    private Singleton() {
        System.out.println("Creating ...");
    }

//    private Singleton() {
//        if(soleInstance != null){
//            throw new RuntimeException("Cannot create, Please use getInstance() method");
//        }
//        System.out.println("Creating ...");
//    }

    //Lazy Instantiation
    public static Singleton getInstance() {
        if (soleInstance == null) {
            soleInstance = new Singleton();
        }
        return soleInstance;
    }

}