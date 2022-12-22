package airport;

import java.util.ArrayList;
import java.util.List;

/**
 * @author piahe
 */
public class FlightRoute {

    private String fromCountry;
    private String toCountry;
    private boolean hasLayovers;
    private List<String> layovers;

    public FlightRoute(String fromCountry, String toCountry, boolean hasLayovers) {
        setFromCountry(fromCountry);
        setToCountry(toCountry);
        this.hasLayovers = hasLayovers;
        this.layovers = new ArrayList<>();
    }

    public String getFromCountry() {
        return fromCountry;
    }

    private void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getToCountry() {
        return toCountry;
    }

    public boolean isHasLayovers() {
        return hasLayovers;
    }

    public void setHasLayovers(boolean hasLayovers) {
        this.hasLayovers = hasLayovers;
    }

    public List<String> getLayovers() {
        return layovers;
    }

    public void addLayover(String country) {
        this.layovers.add(country);
    }
    
    private void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    @Override
    public String toString() {
        return "FlightRoute{" + "fromCountry=" + fromCountry + ", toCountry=" + toCountry + ", hasLayovers=" + hasLayovers + ", layovers=" + layovers + '}';
    }

}

