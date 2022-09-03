package Decorator;

public class Main {
    public static void main(String[] args) {
        Icecream icecream = new Strawberry();
        Decorator decorator = new Chocolate(new Chips(new Wafer(icecream)));
        System.out.println(decorator.prepare());

    }
}
