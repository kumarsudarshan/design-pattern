package creational.pattern.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
//        Singleton s1 = new Singleton(); // can't do
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("S1:" + s1.hashCode());
        System.out.println("S2:" + s2.hashCode());
    }
}
