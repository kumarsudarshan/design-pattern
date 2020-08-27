package creational.pattern.singleton.serialization;

import java.io.*;

public class SingletonPatternDemo {

    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Object - S1:" + s1.hashCode());
        System.out.println("Object - S2:" + s2.hashCode());

        // Serialization example
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/s2.ser"));
        oos.writeObject(s2);

        // Deserialization exmaple
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/s2.ser"));
        Singleton s3 = (Singleton) ois.readObject(); // readResolve()
        System.out.println("Object - S3:" + s3.hashCode());

        System.out.println("Object - S1:" + s1.hashCode());
        System.out.println("Object - S2:" + s2.hashCode());
    }
}
