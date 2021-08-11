package creational.pattern.abstractfactory;

public class OnePlus extends Device {
    private String ram;
    private String processor;

    public OnePlus(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String getDetails() {
        return "Oneplus config is ram:" + this.ram + ", processor: " + this.processor;
    }

    @Override
    public String toString() {
        return "OnePlus{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
