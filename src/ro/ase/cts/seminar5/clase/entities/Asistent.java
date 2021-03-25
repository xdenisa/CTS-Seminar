package ro.ase.cts.seminar5.clase.entities;

public class Asistent extends PersonalSpital{
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "\nAsistent: "+super.getNume();
    }
}
