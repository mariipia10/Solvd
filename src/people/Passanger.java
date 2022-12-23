package people;


import interfaces.Identifiable;

public final class Passanger implements Identifiable<String> {

    private String name;
    private String surname;
    private String passport;

    public Passanger(String name, String surname, String passport) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
    }

    public String getFullName() {
        return name + " " + surname;

    }

    @Override
    public String getID() {
        return this.passport;
    }

    @Override
    public void setID(String x) {
        this.passport = x;
    }

    @Override
    public String toString() {
        return "Passanger{" + "name=" + name + ", surname=" + surname + ", passport=" + passport + '}';
    }

}

