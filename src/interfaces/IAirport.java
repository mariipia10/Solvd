package interfaces;

import airport.Flight;

public interface IAirport {

    public Flight searchFlight(String from, String to);

    public void showFlights();

}