package Mediator;

public class Flight implements Command{
    String id;
    private ATC atcMediator;
    Flight(String id,ATC atcMediator){
        this.atcMediator = atcMediator;
        this.id = id;
    }

    @Override
    public void land() {

        if(atcMediator.isAvailable()){
            System.out.println(this.id+" Flight landed succesfully");
            atcMediator.setAvailability(false);//Runway is occupied
        }

        else{
            System.out.println("Runway is busy ");
        }

    }
    public void readytoLand(){
        System.out.println("Landing Initaited..............");
    }
    public void parked(){
        System.out.println("Parking Successfully........");
        atcMediator.setAvailability(true);
    }
}
