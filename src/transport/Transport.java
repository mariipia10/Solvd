package transport;


public abstract class Transport {
    private int id;
    private int capacity;

    public int getCapacity() {
        return this.capacity;
    }

    ;

    public int getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Transport(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Transport{" + "id=" + id + ", capacity=" + capacity + '}';
    }


}