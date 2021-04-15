package ro.ase.cts.seminar8.clase;

public class NotaDePlata implements INota {
    private int suma;

    public NotaDePlata(int suma) {
        this.suma = suma;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    @Override
    public void printeaza() {
        System.out.println("S-a printat nota de plata cu suma: "+suma);
    }
}
