package ro.ase.cts.seminar9.command;

public class Masa {
    private int nrMasa;
    private boolean esteOcupata;
    private boolean esteRezervata;

    public Masa(int nrMasa, boolean esteOcupata, boolean esteRezervata) {
        this.nrMasa = nrMasa;
        this.esteOcupata = esteOcupata;
        this.esteRezervata = esteRezervata;
    }

    public void ocupa(){
        if(esteOcupata==false)
        {
            System.out.println("Masa cu nr "+nrMasa+" poate fi ocupata!");
            esteOcupata=true;
        }
        else
        {
            System.out.println("Masa cu nr "+nrMasa+" nu poate fi ocupata!");
        }
    }

    public void rezerva() {
        if(esteRezervata==false)
        {
            System.out.println("Masa cu nr "+nrMasa+" poate fi rezervata!");
            esteRezervata=true;
        }
        else
        {
            System.out.println("Masa cu nr "+nrMasa+" nu poate fi rezervata!");
        }
    }
}
