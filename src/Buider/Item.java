package Buider;

public interface Item {
    public String name();
    public Packaging packing();
    public float price();
}


interface Packaging{
    String pack();
}
class Wrapper implements Packaging{

    @Override
    public String pack() {
        return "Wrapper";
    }
}

class Bottle implements Packaging{

    @Override
    public String pack() {
        return "Bottle";
    }
}