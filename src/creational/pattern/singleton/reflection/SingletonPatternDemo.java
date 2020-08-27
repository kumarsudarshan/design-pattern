package creational.pattern.singleton.reflection;

import java.lang.reflect.Constructor;

public class SingletonPatternDemo {

    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Object - S1:" + s1.hashCode());
        System.out.println("Object - S2:" + s2.hashCode());

        // Reflection
        Class clazz = Class.forName("pattern.reflection.Singleton");
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true); // this violates & change constructor to public constructor
        Singleton s3 = constructor.newInstance();
        System.out.println("Object - S3:" + s3.hashCode());

    }
}
// Db2PersistenceProvider
// RDSImportThreadPool
// BgActivities