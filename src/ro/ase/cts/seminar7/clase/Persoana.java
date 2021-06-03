package ro.ase.cts.seminar7.clase;

public class Persoana {
    private String nume;
    private String CNP;

    public Persoana(String nume, String CNP) {
        this.nume = nume;
        this.CNP = CNP;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }
}
