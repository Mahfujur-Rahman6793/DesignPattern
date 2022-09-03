package Buider;

public abstract class Burger implements Item{
    public Packaging packing(){
        return new Wrapper();
    }
    public abstract float price();
}

abstract class ColdDrinks implements Item{
    public Packaging packing(){
        return new Bottle();
    }
    public abstract float price();
}
