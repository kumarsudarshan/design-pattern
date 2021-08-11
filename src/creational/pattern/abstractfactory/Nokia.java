package creational.pattern.abstractfactory;

public class Nokia extends Device {
    private String ram;
    private String processor;

    public Nokia(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String getDetails() {
        return "Nokia config is ram:" + this.ram + ", processor: " + this.processor;
    }

    @Override
    public String toString() {
        return "Nokia{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
