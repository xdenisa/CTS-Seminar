package ro.ase.cts.seminar5.clase.entities;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "\nBrancardier: "+super.getNume();
    }
}
