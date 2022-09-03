package Mediator;

public class Runway implements Command{
    String runwayName;
    ATC atcMediator;
    Runway(ATC atcMediator, String runwayName){
        this.atcMediator = atcMediator;
        this.runwayName = runwayName;
    }
    @Override
    public void land() {
        System.out.println(this.runwayName + "Runway is Available");
        atcMediator.setAvailability(true);

    }
}
