package proxy;

public class Main {

    public static void main(String[] args) {
        ProxyInternet proxyInternet = new ProxyInternet();
        proxyInternet.connect("google");
        proxyInternet.connect("youtube");
        proxyInternet.connect("facebook");
    }
}
