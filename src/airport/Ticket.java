package airport;


import interfaces.Identifiable;
import interfaces.Printable;
import people.Passanger;

import java.sql.SQLOutput;
import java.util.List;

/**
 * @author piahe
 */
public class Ticket implements Identifiable<Integer>, Printable {

    private int id;
    private double totalPrice;
    private List<Flight> flights;
    private Passanger passanger;
    private boolean hasLayover;
    private String from;

    private String to;

    public Ticket(int id, double price, List<Flight> lFlights, Passanger passanger, String from, String to) {
        setID(id);
        setTotalPrice(price);
        setPassanger(passanger);
        setFlights(lFlights);
    }

    private void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    private void setPassanger(Passanger passanger) {
        this.passanger = passanger;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Passanger getPassanger() {
        return passanger;
    }

    @Override
    public Integer getID() {
        return this.id;
    }

    @Override
    public void setID(Integer x) {
        this.id = x;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", totalPrice=" + totalPrice + ", flights=" + flights + ", passanger=" + passanger + ", hasLayover=" + hasLayover + '}';
    }

    @Override
    public void print() {
        System.out.println("********************");
        System.out.println("TICKET INFORMATION");
        System.out.println("ID : " + id);
        System.out.println("Passanger : " + passanger.getFullName());
        System.out.println("Flying from: " + from);
        System.out.println("Flying to: " + to);
        System.out.println("Total cost: $" + totalPrice);
        System.out.println("********************");

    }
}

