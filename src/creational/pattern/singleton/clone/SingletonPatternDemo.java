package creational.pattern.singleton.clone;

public class SingletonPatternDemo {

    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Object - S1:" + s1.hashCode());
        System.out.println("Object - S2:" + s2.hashCode());

        Singleton s3 = (Singleton) s2.clone();

        System.out.println("Object - S3:" + s3.hashCode());
        System.out.println("Object - S1:" + s1.hashCode());
        System.out.println("Object - S2:" + s2.hashCode());
    }

}
