package structural.pattern.proxy;

public class ClientMain {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Kumar");
        access.grantInternetAccess();
    }
}
