package creational.pattern.abstractfactory;

public class HP extends Device {
    private String ram;
    private String processor;
    private String gpu;

    public HP(String ram, String processor, String gpu) {
        this.ram = ram;
        this.processor = processor;
        this.gpu = gpu;
    }

    @Override
    public String getDetails() {
        return "HP config is ram:" + this.ram + ", processor: " + this.processor + ", gpu: " + this.gpu;
    }

    @Override
    public String toString() {
        return "HP{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
