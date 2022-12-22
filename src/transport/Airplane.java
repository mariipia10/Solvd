package transport;

import interfaces.Identifiable;

public class Airplane extends Transport implements Identifiable<Integer> {

    private final static int MAX_CAPACITY = 150;

    public Airplane(int id, int capacity) {
        super(MAX_CAPACITY, capacity);
    }

    @Override
    public int getCapacity() {
        return super.getCapacity();
    }

    @Override
    public Integer getID() {
        return super.getId();
    }

    @Override
    public void setID(Integer x) {
        super.setId(x);
    }

}
