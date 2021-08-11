package creational.pattern.abstractfactory;

public class LaptopFactory extends AbstractDeviceFactory {
    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType) {
            case DELL:
                return new Dell("8GB", "Intel", "NVIDIA");
            case HP:
                return new HP("16GB", "AMD", "AMD");
        }
        return null;
    }
}
