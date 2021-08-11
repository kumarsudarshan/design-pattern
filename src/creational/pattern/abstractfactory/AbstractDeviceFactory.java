package creational.pattern.abstractfactory;

public abstract class AbstractDeviceFactory {
    abstract Device getGadget(DeviceType deviceType);
}
