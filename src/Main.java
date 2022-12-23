import airport.*;
import people.Passanger;
import transport.Airplane;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> layovers1, layovers2, layovers3, layovers4;
        layovers1 = layovers2 = layovers3 = layovers4 = new ArrayList<>();
        layovers1.add("Brasil");
        layovers2.add("Chile");
        layovers3.add("Uruguay");
        FlightRoute fr1 = new FlightRoute("Argentina", "France", layovers1);
        FlightRoute fr2 = new FlightRoute("France", "Argentina", layovers2);
        FlightRoute fr3 = new FlightRoute("Argentina", "Brasil", layovers3);
        FlightRoute fr4 = new FlightRoute("Brasil", "Argentina", layovers3);

        Passanger p1 = new Passanger("Juan", "Perez", "37587655");
        Flight fl1 = new Flight(fr4, 1, 2054, 0205, new Airplane(2, 100), 50);
        Airport ezeiza = new Airport();
        ezeiza.addFlight(fl1);

        ezeiza.showFlights(); // TBD
        Ticket ticket = ezeiza.buyTicket("Argentina", "France", p1);
        ticket.print(); //TBD
    }
}