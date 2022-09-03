package Decorator;

public interface Icecream {
    public String prepare();
}
class Vanilla implements Icecream {

    @Override
    public String prepare() {
        return "Vanilla Flavor ";
    }
}

class Strawberry implements Icecream {

    @Override
    public String prepare() {
        return "Strawberry Flavor ";
    }
}
