package proxy;

public interface Internet {
    void connect( String url);
}
class RealInternet implements Internet{

    @Override
    public void connect(String url) {
        System.out.println("Connected " + url);
    }
}

class ProxyInternet implements Internet{
    private Internet realInternet;
    public ProxyInternet(){
        realInternet = new RealInternet();
    }

    @Override
    public void connect(String url) {
        if (url.equalsIgnoreCase("youtube")){
            System.out.println("Access denied");
        }
        else{
            System.out.println("Access granted");
        }
    }
}
