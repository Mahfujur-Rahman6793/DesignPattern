package Decorator;

public class Decorator implements Icecream{
    Icecream icecream;
    Decorator(Icecream icecream){
        this.icecream = icecream;
    }

    @Override
    public String prepare() {
        return icecream.prepare();
    }
}

class Wafer extends Decorator{

    Wafer(Icecream icecream){
        super(icecream);

    }
    @Override
    public String prepare() {
        return icecream.prepare() + "Wafer =>";
    }

}

class Chocolate extends Decorator{
    Chocolate(Icecream icecream){
        super(icecream);
    }
    @Override
    public String prepare() {
        return icecream.prepare() + "Chocolate =>";
    }

}

class Chips extends Decorator{
    Chips(Icecream icecream){
        super(icecream);
    }
    @Override
    public String prepare() {
        return icecream.prepare() + "Chips =>";
    }
}
