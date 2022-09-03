package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ATC implements IATC{
    List<Flight> flights = new ArrayList<Flight>();
    List<Runway> runways = new ArrayList<Runway>();
    Boolean available;
    @Override
    public void registerFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public void registerRunway(Runway runway) {
        runways.add(runway);
    }

    @Override
    public void setAvailability(Boolean status) {
        this.available = status;
    }

    @Override
    public Boolean isAvailable() {
        return available;
    }
}
