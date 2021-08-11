package creational.pattern.abstractfactory;

public class MobileFactory extends AbstractDeviceFactory {
    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType) {
            case ONEPLUS:
                return new OnePlus("8GB", "Mediatek");
            case HP:
                return new Nokia("6GB", "Snapdragon");
        }
        return null;
    }
}
