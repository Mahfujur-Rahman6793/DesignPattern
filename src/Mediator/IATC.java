package Mediator;

public interface IATC {
    public void registerFlight(Flight flight);
    public void registerRunway(Runway runway);
    public void setAvailability(Boolean status);
    public Boolean isAvailable();
}
