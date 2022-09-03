package Buider;

public class Coke extends ColdDrinks{
    @Override
    public String name() {
        return "CocaCola";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}

class Pepsi extends ColdDrinks{

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}