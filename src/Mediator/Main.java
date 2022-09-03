package Mediator;

public class Main {
    public static void main(String[] args) {
        ATC atc = new ATC();
        Flight f1 = new Flight("121", atc);
        Flight f2 = new Flight("124", atc);
        Runway r1 = new Runway(atc,"Bangla");
        Runway r2 = new Runway(atc,"British");
        atc.registerFlight(f1);
        atc.registerFlight(f2);
        atc.registerRunway(r1);
        atc.registerRunway(r2);
        r1.land();
        f1.land();
    }
}
