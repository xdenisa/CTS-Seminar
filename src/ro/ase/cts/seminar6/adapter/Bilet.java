package ro.ase.cts.seminar6.adapter;

public class Bilet {
    private float pret;

    public Bilet(float pret) {
        this.pret = pret;
    }

    public void rezerva(){
        System.out.println("S-a rezervat biletul cu pretul "+pret);
    }

    public void vanzare(){
        System.out.println("S-a vandut biletul cu pretul "+pret);
    }
}
