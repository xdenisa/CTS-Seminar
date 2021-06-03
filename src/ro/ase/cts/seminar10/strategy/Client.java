package ro.ase.cts.seminar10.strategy;

public class Client {
    private IPlata metodaPlata;
    private String nume;

    public Client(String nume) {
        this.nume = nume;
        this.metodaPlata=new PlataCash();
    }

    public void setMetodaPlata(IPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void efectueazaPlata(float suma)
    {
        System.out.print(nume+": ");
        metodaPlata.plateste(suma);
        System.out.println();
    }
}
