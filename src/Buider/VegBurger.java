package Buider;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Vegetable Burger";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}

class ChikenBurger extends Burger{

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
