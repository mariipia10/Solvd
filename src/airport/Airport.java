package airport;


import interfaces.IAirport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author piahe
 */
public class Airport implements IAirport {

    public List<Flight> flights;

    public Airport() {
        this.flights = new ArrayList<>();
    }

    public boolean addFlight(Flight flight) {
        return this.flights.add(flight);
    }

    public boolean addFlights(List<Flight> flights) {
        return this.flights.addAll(flights);
    }

    @Override
    public Flight searchFlight(String from, String to) {
        Flight f = null;
        boolean flag = false;
        int i = 0;
        while (!flights.isEmpty() && !flag) {
            flag = flights.get(i).compareFlightRoute(from, to);
            if (flag) {
                f = flights.get(i);
            }
        }
        return f;
    }

    @Override
    public void showFlights() {
        for (Iterator<Flight> iterator = flights.iterator(); iterator.hasNext(); ) {
            Flight next = iterator.next();
            System.out.println(next.toString());
        }

    }

}
