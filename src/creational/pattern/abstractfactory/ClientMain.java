package creational.pattern.abstractfactory;

public class ClientMain {
    public static void main(String[] args) {
        Device dell = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadget(DeviceType.DELL);
        System.out.println(dell.getDetails());

        // also we can do in 2 step
        AbstractDeviceFactory mobileFactory = FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY);

        Device onePlus = mobileFactory.getGadget(DeviceType.ONEPLUS);

        System.out.println(onePlus.getDetails());
        System.out.println(onePlus.toString());
    }
}
