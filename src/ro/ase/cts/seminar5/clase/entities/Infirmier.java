package ro.ase.cts.seminar5.clase.entities;

public class Infirmier extends PersonalSpital{
    public Infirmier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "Infirmier: "+super.getNume();
    }
}
