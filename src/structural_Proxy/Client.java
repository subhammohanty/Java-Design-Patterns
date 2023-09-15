package structural_Proxy;

public class Client {

    public static void main(String[] args) {
        Subject proxy = new ProxySubjectClass();
        proxy.method();
    }
}
