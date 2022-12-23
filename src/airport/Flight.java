package airport;

import java.util.ArrayList;
import java.util.List;

import interfaces.IComparable;
import people.Passanger;
import interfaces.Identifiable;
import transport.Airplane;

public class Flight implements Identifiable<Integer>, IComparable {
    private FlightRoute flightRoute;
    private int id;
    private int arriveTime; //Future refactor into LocalDate!
    private int departureTime;
    private Airplane airplane;
    private int availableSeats;

    private List<Passanger> passangers;
    private double basePrice = 100.0;

    public Flight(FlightRoute flightRoute, int id, int arriveTime, int departureTime, Airplane airplane, int availableSeats) {
        this.flightRoute = flightRoute;
        this.id = id;
        this.arriveTime = arriveTime;
        this.departureTime = departureTime;
        this.airplane = airplane;
        this.availableSeats = availableSeats;
        this.passangers = new ArrayList<>();
    }

    public void addPassanger(Passanger p) {
        this.passangers.add(p);
    }

    public boolean hasCapacity() {
        return availableSeats >= airplane.getCapacity();
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getArriveTime() {
        return arriveTime;
    }

    private void setArriveTime(int arriveTime) {
        this.arriveTime = arriveTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    private void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + this.arriveTime;
        hash = 37 * hash + this.departureTime;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Flight other = (Flight) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.arriveTime != other.arriveTime) {
            return false;
        }
        return this.departureTime == other.departureTime;
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
        return "Flight{" + "flightRoute=" + flightRoute + ", id=" + id + ", arriveTime=" + arriveTime + ", departureTime=" + departureTime + ", airplane=" + airplane + ", availableSeats=" + availableSeats + ", passangers=" + passangers + '}';
    }

    @Override
    public boolean compareString(String from, String to) {
        return flightRoute.getToCountry().equals(to) && flightRoute.getFromCountry().equals(from);
    }
}

