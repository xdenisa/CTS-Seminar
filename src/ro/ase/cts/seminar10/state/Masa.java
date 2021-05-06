package ro.ase.cts.seminar10.state;

public class Masa {
    private Stare stare;
    private int numar;

    public Masa(int numar) {
        this.numar = numar;
        this.stare=new StareLibera();
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void rezervaMasa(){
        StareRezervata stareRezervata=new StareRezervata();
        stareRezervata.modificaStare(this);
    }

    public void ocupaMasa(){
        StareOcupata stareOcupata=new StareOcupata();
        stareOcupata.modificaStare(this);
    }

    public void elibereazaMasa(){
        StareLibera stareLibera=new StareLibera();
        stareLibera.modificaStare(this);
    }
}
