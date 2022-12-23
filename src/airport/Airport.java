package airport;


import interfaces.IAirport;
import people.Passanger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Airport implements IAirport {
    final static int MIN = 100;
    final static int MAX = 100000;
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
            flag = flights.get(i).compareString(from, to);
            if (flag) {
                f = flights.get(i);
            }
        }
        return f;
    }

    @Override
    public void showFlights() {
        for (Flight next : flights) {
            System.out.println(next.toString());
        }

    }

    public int rnd() {
        int random_int = (int) Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
        return random_int;
    }

    public Ticket buyTicket(String from, String to, Passanger passanger) {
        Ticket t = null;
        Flight flight = searchFlight(from, to);
        List<Flight> lFlights = null;
        if (flight.hasCapacity()) {
            lFlights.add(flight);
            t = new Ticket(rnd(), flight.getBasePrice(), lFlights, passanger, from, to);
        }
        return t;
    }

}
