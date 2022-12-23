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

    public FlightRoute(String fromCountry, String toCountry, List<String> layovers) {
        setFromCountry(fromCountry);
        setToCountry(toCountry);
        setLayovers(layovers);
        this.layovers = new ArrayList<>();
    }

    public void setLayovers(List<String> layovers) {
        this.layovers = layovers;
        this.hasLayovers = true;
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

    public boolean HasLayovers() {
        return hasLayovers;
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

